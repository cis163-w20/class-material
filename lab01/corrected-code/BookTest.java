package library;

import org.testng.annotations.AfterTest;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(true, b1.getCheckedOut().isEmpty());
    }

    // Testing CheckOut
    @Test
    public void testCheckOut() {
        Book b1 = new Book("The Great Gatsby", 3);
        assertEquals(0, b1.checkOut(531));
        assertEquals(1, b1.getNumCheckedOut());
        assertEquals(0, b1.checkOut(208));
        assertEquals(2, b1.getNumCheckedOut());
        assertEquals(0, b1.checkOut(211));
        assertEquals(3, b1.getNumCheckedOut());
        assertEquals(-1, b1.checkOut(208));
        assertEquals(3, b1.getNumCheckedOut());
    }

    // Testing Return
    @Test
    public void testReturn() {
        Book b1 = new Book("The Great Gatsby", 3);
        b1.checkOut(101);
        b1.checkOut(105);
        b1.returnBook(101);
        assertEquals(1,b1.getNumCheckedOut());
        assertEquals(1, b1.getCheckedOut().size());
        b1.returnBook(105);
        assertEquals(0,b1.getNumCheckedOut());
        assertEquals(0, b1.getCheckedOut().size());
    }
}
