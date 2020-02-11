package library;
import java.util.ArrayList;

public interface BookRepository {
    public abstract void addBook(Book b);
    public abstract void removeBook(Book b);
    public abstract ArrayList<Book> getBooks();
}
