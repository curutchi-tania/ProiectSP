import java.util.ArrayList;
import java.util.List;
public class Book {
    private final String name;
    private final List<Author> authorNames = new ArrayList<>();
    private final List<Chapter> chapterList = new ArrayList<>();

    public Integer createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        chapterList.add(chapter);
        return chapterList.size()-1;
    }

    public Chapter getChapter(int index) {
        return chapterList.get(index);
    }

    public void addAuthor(Author authorName) {
        authorNames.add(authorName);
    }

    public Book(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
        for (Author a : authorNames) {
            a.print();
        }
    }
}


