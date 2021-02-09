import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> bookShelf;

    public Borrower(String name){
        this.name = name;
        this.bookShelf = new ArrayList<Book>();
    }


    public String getName() {
        return this.name;
    }
}
