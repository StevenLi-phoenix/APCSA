public class PictureBook extends Book {
    private String illustrator;
    public PictureBook(String name, String author, String illustrator) {
        super(name, author);
        this.illustrator = illustrator;
    }
    public void printBookInfo() {
        System.out.println(super.getBookInfo() + "and illustrated by" + illustrator);
    }
    public String getBookInfo() {
        return super.getBookInfo() + "and illustrated by" + illustrator;
    }
}
