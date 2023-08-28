import java.util.ArrayList;
import java.util.List;

public class Library implements Library_Interface{
    private List<Book> Books;
    public Library(){
       Books = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        Books.add(book);
    }
    public void removeBook(Book book){
        Books.remove(book);
    }

    public List<Book> getBooks() {
        return Books;
    }

    public void setBooks(List<Book> books) {
        Books = books;
    }
}


