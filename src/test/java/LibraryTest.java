import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Newington Library", 4);
        book = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
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

    @Test
    public void cannotAddBookIfCollectionFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.lendBook();
        assertEquals(0, library.bookCount());
    }
}
