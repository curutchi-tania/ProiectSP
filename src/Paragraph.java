import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element, Visitee{
    public String text;
    private final List<Element> paragraph = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

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

    public void setAlignStrategy(AlignCenter alignCenter) {
    }

    public void setAlignStrategy(AlignRight alignRight) {
    }

    public void setAlignStrategy(AlignLeft alignLeft) {
    }
}
