import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before(){
        library = new Library("Newington Library");
    }

    @Test
    public void hasName(){
        assertEquals("Newington Library", library.getName());
    }

    @Test
    public void booksCounted(){
        assertEquals(0, library.countBooks());
    }
}
