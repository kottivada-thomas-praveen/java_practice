package Projects.LibraryManagement;

/**
 * book
 */
public class book {

    int id;
    String title;
    String author;
    boolean available;

    book(int id, String title, String author, boolean available){
        this.id = id;
        this.title = title;
        this.author = author;

        available = true;
    }
}