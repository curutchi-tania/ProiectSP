public interface Visitor<T>{
    public Book visitBook(T visitBook);
    public BookStatistics visitBookStatistics(T visitBookStatistics);
    public Section visitSection(T visitSection);
    public TableOfContents visitTableOfContents(T visitTableOfContents);
    public Paragraph visitParagraph(T visitParagraph);
    public ImageProxy visitImageProxy(T visitImageProxy);
    public Image visitImage(T visitImage);
    public Table visitTable(T visitTable);
}
