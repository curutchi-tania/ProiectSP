import java.util.ArrayList;
import java.util.List;
public class Book {
    private final String name;
    private final List<Author> authorNames = new ArrayList<>();
    private final List<Element> book = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }

    public void addAuthor(Author authorName) {
        authorNames.add(authorName);
    }

    public void addContent(Element element) {
        book.add(element);
    }

    public void print() {
        System.out.println(name);
        for (Author a : authorNames) {
            a.print();
        }
        for (Element e : book) {
            e.print();
        }
    }
}


