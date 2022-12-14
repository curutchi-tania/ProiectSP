import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee{
    private final String title;
    private final List<Element> section = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        section.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        section.add(element);
    }

    @Override
    public void remove(Element element) {
        section.remove(element);
    }

    @Override
    public Element get(int e) {
        return section.get(e);
    }
}
