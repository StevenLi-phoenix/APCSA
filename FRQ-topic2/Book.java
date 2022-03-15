public class Book {
    public String title;
    public String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void printBookInfo() {
        System.out.println(title + ", written by " + author);
    }
    public String getBookInfo() {
        return title + ", written by " + author;
    }
}
