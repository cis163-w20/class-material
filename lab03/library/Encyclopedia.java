package library;

public class Encyclopedia extends Book {
    private int numEntries;

    public Encyclopedia(String name, int numCopies, Publisher pub, int pub_year, int npages, int numEntries) {
        super(name, numCopies, pub, pub_year, npages);
        this.numEntries = numEntries;
    }

    public int getNumEntries() {
        return numEntries;
    }
    public void setNumEntries(int n) {
        numEntries = n;
    }
    public double getRatio() {
        return (double)this.getNpages() / this.getNumEntries();
    }
}
