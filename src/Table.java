import java.util.ArrayList;
import java.util.List;

public class Table implements Element, Visitee{
    public String Title;
    private final List<Element> table = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    public Table(String title) {
        Title = title;
    }

    @Override
    public void print() {
        table.forEach(Element::print);
        System.out.println(table);
    }

    @Override
    public void add(Element element) {
        table.add(element);
    }

    @Override
    public void remove(Element element) {
        table.remove(element);
    }

    @Override
    public Element get(int e) {
        return table.get(e);
    }
}
