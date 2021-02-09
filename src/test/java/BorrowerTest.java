import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Matt");
        library = new Library("Newington Library", 30);
        book = new Book("The Dunwich Horror", "H.P. Lovecraft", "Horror");
    }

    @Test
    public void hasName(){
        assertEquals("Matt", borrower.getName());
    }

    @Test
    public void bookShelfCounted(){
        assertEquals(0, borrower.bookShelfCount());
    }

//    @Test
//    public void canBorrowFromLibrary(){
//        library.addBook(book);
//        borrower.borrowFromLibrary(library);
//        assertEquals(1, borrower.bookShelfCount());
//    }
}
