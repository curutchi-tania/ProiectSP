import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Chapter {
    private final String chapterName;
    private final List<SubChapter> subChapterList = new ArrayList<>();

    public Integer createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapterList.add(subChapter);
        return subChapterList.size()-1;
    }

    public SubChapter getSubChapter(int indexSubChapter) {
        return subChapterList.get(indexSubChapter);
    }

    public Chapter(String chapterName) {
        this.chapterName = chapterName;
    }

    public void print(){
        System.out.println(chapterName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(chapterName, chapter.chapterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chapterName);
    }
}
