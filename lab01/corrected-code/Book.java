package library;
import java.util.ArrayList;

public class Book {
    public int getNumCheckedOut() {
        return numCheckedOut;
    }

    public void setNumCheckedOut(int numCheckedOut) {
        this.numCheckedOut = numCheckedOut;
    }

    /** Total number of copies of the book */
    private int numCopies;

    /** Name of the book */
    private String name;

    /** Number of copies currently checked out */
    private int numCheckedOut;

    /** List of user ids with copy of book checked out */
    private ArrayList<Integer> checkedOut;

    /**
     * This constructor creates a new book that is not currently checked out or waited on by anyone.
     *
     * @param name the name of the book
     * @param numCopies the number of copies owned by the library
     */
    public Book(String name, int numCopies) {
        this.name = name;
        this.numCopies = numCopies;
        checkedOut = new ArrayList<Integer>();
        numCheckedOut = 0;
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

    public ArrayList<Integer> getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(ArrayList<Integer> checkedOut) {
        this.checkedOut = checkedOut;
    }

    /**
     * Checks out a copy of the book
     * Adjusts number of checked out copies and adds user to checked out list
     *
     * @param a the id of the user checking out this book
     * @return whether checkout was possible (0 if success, -1 if failure)
     */
    public int checkOut(int a) {
        if(numCheckedOut < numCopies) {
            numCheckedOut++;
            checkedOut.add(a);
            return 0;
        }
        else {
            return -1;
        }


    }

    /**
     * Returns a copy of the book
     * Adjusts number of checked out copies and removes user from checked out list
     *
     * @param a the id of the user returning the book
     */
    public void returnBook(int a) {
        numCheckedOut--;
        checkedOut.remove(new Integer(a));
    }
}
