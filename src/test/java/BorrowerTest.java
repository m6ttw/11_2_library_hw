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
        library = new Library("Newington Library", 20);
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

    @Test
    public void canAddBookToShelf(){
        borrower.addToBookShelf(book);
        assertEquals(1, borrower.bookShelfCount());
    }

    @Test
    public void canRemoveBookFromShelf(){
        borrower.addToBookShelf(book);
        borrower.removeFromBookshelf();
        assertEquals(0, borrower.bookShelfCount());
    }

    @Test
    public void canBorrowFromLibrary(){
        library.addBook(book);
        borrower.borrowFromLibrary(library);
        assertEquals(1, borrower.bookShelfCount());
    }

    @Test
    public void canReturnToLibrary(){
        borrower.addToBookShelf(book);
        borrower.returnToLibrary(library);
        assertEquals(1, library.bookCount());
    }
}
