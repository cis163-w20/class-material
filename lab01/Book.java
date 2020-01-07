package library;
import java.util.ArrayList;

public class Book {

    /** Total number of copies of the book */
    private int numCopies;

    /** Name of the book */
    private String name;

    /** Number of copies currently checked out */
    private int numCheckedOut;

    /** List of user ids with copy of book checked out */
    private ArrayList<int> checkedOut;

    /**
     * This constructor creates a new book that is not currently checked out or waited on by anyone.
     *
     * @param name the name of the book
     * @param numCopies the number of copies owned by the library
     */
    public Book(String name, int numCopies) {
        name = name;
        numCopies = numCopies;
        checkedOut = new ArrayList<int>();
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(ArrayList<User> checkedOut) {
        this.checkedOut = checkedOut;
    }

    /**
     * Checks out a copy of the book
     * Adjusts number of checked out copies and adds user to checked out list
     *
     * @param a the id of the user checking out this book
     * @return whether checkout was possible (0 if success, 1 if failure)
     */
    public int checkOut(int a) {
        this.numCheckedOut++;
        this.checkedOut.add()
        return 0;
    }

    /**
     * Returns a copy of the book
     * Adjusts number of checked out copies and removes user from checked out list
     *
     * @param a the id of the user returning the book
     */
    public int return(int a) {
        this.numCheckedOut--;
    }
}
