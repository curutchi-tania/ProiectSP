import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    private final String text;
    private final List<Element> paragraph = new ArrayList<>();

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        paragraph.forEach(Element::print);
        System.out.println(text);
    }

    @Override
    public void add(Element element) {
        paragraph.add(element);
    }

    @Override
    public void remove(Element element) {
        paragraph.remove(element);
    }

    @Override
    public Element get(int e) {
        return paragraph.get(e);
    }
}
