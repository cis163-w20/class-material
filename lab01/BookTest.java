package library;

import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class BookTest {
    /**
     * Test cases for a single book
     */

    // Testing constructors
    @Test
    public void testConstructor() {
        Book b1 = new Book("The Great Gatsby", 3);
        assertEquals(3, b1.getNumCopies());
        assertEquals("The Great Gatsby", b1.getName());
        assertEquals(0, b1.getNumCheckedOut());
        assertEquals(True, b1.getCheckedOut().isEmpty());
    }

    // Testing CheckOut
    @Test
    public void testCheckOut() {
        Book b1 = new Book("The Great Gatsby", 3);
        assert(0, b1.checkOut(531));
        assert(1, b1.getNumCheckedOut);
        assert(0, b1.checkOut(208));
        assert(2, b1.getNumCheckedOut);
        assert(0, b1.checkOut(211));
        assert(3, b1.getNumCheckedOut);
        assert(-1, b1.checkOut(208));
        assert(3, b1.getNumCheckedOut);
    }

    // Testing Return
    @Test
    public void testReturn() {
        Book b1 = new Book("The Great Gatsby", 3);
        b1.checkOut(101);
        b1.checkOut(105);
        b1.return(101);
        assert(1,b1.getNumCheckedOut());
        assert(1, b1.getCheckedOut().size());
        b1.return(105);
        assert(0,b1.getNumCheckedOut());
        assert(0, b1.getCheckedOut().size());
    }
}
