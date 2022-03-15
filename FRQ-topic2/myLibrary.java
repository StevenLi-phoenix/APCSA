import java.util.ArrayList;

public class myLibrary {
    public static void main(String[] args) {
        ArrayList<Book> myLibraryList = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein","Mary Shelley");
        Book book2 = new PictureBook("titled The Wonderful Wizard of Oz","L. Frank Baum","W.W. Denslow");
        myLibraryList.add(book1);
        myLibraryList.add(book2);
    }
}
