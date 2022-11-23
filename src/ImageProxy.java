import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element, Picture{
    private final Dimension dim;
    private final Image url;
    private String imageName;
    private final List<Element> imageProxy = new ArrayList<>();

    public ImageProxy(Dimension dim, Image url) {
        this.dim = dim;
        this.url = url;
    }

    void Image(String name) {
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
