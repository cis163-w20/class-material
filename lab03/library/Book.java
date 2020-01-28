package library;
import java.util.ArrayList;

public class Book {
    private int numCopies;
    private String name;
    private int numCheckedOut;
    private ArrayList<User> checkedOut;
    protected int npages;
    protected Publisher pub;
    private int pub_year;

    public Book(String name, int numCopies, Publisher pub, int pub_year, int npages) {
        this.name = name;
        this.numCopies = numCopies;
        this.pub = pub;
        this.pub_year = pub_year;
        this.npages = npages;
        checkedOut = new ArrayList<User>();
        numCheckedOut = 0;
    }

    public int getNumCheckedOut() {
        return numCheckedOut;
    }

    public int getNpages() {
        return npages;
    }

    public void setNumCheckedOut(int numCheckedOut) {
        this.numCheckedOut = numCheckedOut;
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
}
