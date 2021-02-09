import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book){
        if (collection.size() < this.capacity){
        this.collection.add(book);
        }
    }

    public Book lendBook(){
        return this.collection.remove(0);
    }
}
