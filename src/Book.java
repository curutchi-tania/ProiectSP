import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String name;
    private final List<String> cuprins = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }
    
    public void createNewParagraph(String paragraph) {
        cuprins.add(paragraph);
    }
    
    public void createNewImage(String image) {
        cuprins.add(image);
    }
    
    public void createNewTable(String table) {
        cuprins.add(table);
    }

    public void print() {
        System.out.println(name);
        for (String c : cuprins) {
            System.out.println(c);
        }
    }
}
