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

    public int bookShelfCount() {
        return this.bookShelf.size();
    }

    public void addToBookShelf(Book book) {
        this.bookShelf.add(book);
    }

    public Book removeFromBookshelf(){
        return this.bookShelf.remove(0);
    }

    public void borrowFromLibrary(Library library) {
        Book book = library.lendBook();
        this.bookShelf.add(book);
    }

    public void returnToLibrary(Library library){
        Book book = new Book("Trainspotting", "Irvine Welsh", "Genre");
        this.removeFromBookshelf();
        library.addBook(book);
    }
}
