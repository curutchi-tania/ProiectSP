import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private final String url;
    private final List<Element> image = new ArrayList<>();

    public Image(String url) {
        this.url = url;
    }

    public void print(){
        image.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        image.add(element);
    }

    @Override
    public void remove(Element element) {
        image.remove(element);
    }

    @Override
    public Element get(int e) {
        return image.get(e);
    }
}
