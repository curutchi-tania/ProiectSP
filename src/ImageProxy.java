import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element, Picture, Visitee{
    private Dimension dim;
    private Image url;
    private String imageName;
    private final List<Element> imageProxy = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
    public void Image(Dimension dim, Image url) {
        this.dim = dim;
        this.url = url;
    }

    public ImageProxy(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        imageProxy.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        imageProxy.add(element);
    }

    @Override
    public void remove(Element element) {
        imageProxy.remove(element);
    }

    @Override
    public Element get(int e) {
        return imageProxy.get(e);
    }
}
