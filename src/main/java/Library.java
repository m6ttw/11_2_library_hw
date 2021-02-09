import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;

    public Library(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }
}
