public class TableOfContents implements Visitee{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }}
