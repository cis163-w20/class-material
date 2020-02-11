package library;

import java.util.ArrayList;
import java.util.Dictionary;

public class PhysicalLibrary implements BookRepository {
    private ArrayList<Book> contents;

    public PhysicalLibrary(){
        contents = new ArrayList<Book>();
    }

    public Book getBook(String name) {
        for (int i=0; i<contents.size(); i++) {
            if(contents.get(i).getName() == name) {
                return contents.get(i);
            }
        }
        return null;
    }
    public void addBook(Book b) {
        contents.add(b);
    }

    public void removeBook(Book b) {
        contents.remove(b);
    }

    public ArrayList<Book> getBooks() {
        return contents;
    }

    public int checkOut(String name, User u) {
        Book b = getBook(name);
        if(b.getNumCheckedOut() < b.getNumCopies()) {
            b.setNumCheckedOut(b.getNumCheckedOut()+1);
            b.getCheckedOut().add(u);
            return 0;
        }
        else {
            return -1;
        }
    }

    public void returnBook(String name, User u) {
        Book b = getBook(name);
        b.setNumCheckedOut(b.getNumCheckedOut()-1);
        b.getCheckedOut().remove(u);
    }

    public static void main(String[] args) {
        PhysicalLibrary lib = new PhysicalLibrary();
        Publisher scholastic = new Publisher("Scholastic", "NYC");
        Publisher brit = new Publisher("Encyclopedia Britannica", "Chicago");
        User u1 = new User("Erin", 1000);
        User u2 = new User("Cool Erin", 1001);
        lib.addBook(new Book("The Hunger Games", 3, scholastic, 2008,374));
        lib.addBook(new Book("Encyclopedia Britannica", 4, brit, 2010, 500000));
        lib.checkOut("The Hunger Games", u1);
        lib.checkOut("Encyclopedia Britannica", u2);
    }
}
