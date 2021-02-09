import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Newington Library");
        book = new Book();
    }

    @Test
    public void hasName(){
        assertEquals("Newington Library", library.getName());
    }

    @Test
    public void booksCounted(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
}
