public class BookListing {
    private double cost;
    private Book book;
    public BookListing(Book book, double cost){
        this.cost = cost;
        this.book = book;
    }
    public void printDescription(){
        System.out.println(book.getBookInfo() + ", $" + cost);
    }
}
