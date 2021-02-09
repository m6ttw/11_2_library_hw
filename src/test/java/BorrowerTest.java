import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Matt");
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
//        assertEquals(1, borrower.bookShelf)
//    }
}
