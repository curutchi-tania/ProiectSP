import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubChapter {
    private final String subchapterName;
    private final List<Paragraph> paragraphList = new ArrayList<>();
    private final List<Image> imageList = new ArrayList<>();
    private final List<Table> tableList = new ArrayList<>();

    public void createNewParagraph(String paragraphName) {
        Paragraph paragraph = new Paragraph(paragraphName);
        paragraphList.add(paragraph);
    }

    public void createNewImage(String imageName) {
        Image image = new Image(imageName);
        imageList.add(image);
    }

    public void createNewTable(String tableName) {
        Table table = new Table(tableName);
        tableList.add(table);
    }

    public SubChapter(String subchapterName) {
        this.subchapterName = subchapterName;
    }

    public void print(){
        System.out.println(subchapterName);
        for(Paragraph p : paragraphList) {
            p.print();
        }
        for(Image i : imageList) {
            i.print();
        }
        for(Table t : tableList) {
            t.print();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubChapter that = (SubChapter) o;
        return Objects.equals(subchapterName, that.subchapterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subchapterName);
    }
}
