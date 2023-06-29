import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore extends Book {

    private Map<Book, Integer> books = new HashMap<>();

    public BookStore(String title, String author, int price) {
        super(title, author, price);
    }


    public void addBook(Book book) {
        if (books.containsKey(book)) {
            int eddigMennyiKonyv = books.get(book);
            books.put(book, eddigMennyiKonyv + 1);

            // ugyanaz máshogy
            // books.put(book, (books.get(book)+1));
        }
        System.out.println(books.put(book, 1));
    }

    public void addBookWithQuantity(Book book, int howMany) {
        System.out.println(books.put(book, howMany));
    }

    public Book findBook(String title) throws BookNotFound {
        for (Book book : books.keySet()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new BookNotFound("This book is not found");
    }

    public void displayBooks() {
        System.out.println("The books in the bookstore : ");
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            System.out.println("Book " + entry.getKey() + ". Quantity : " + entry.getValue() + ".");
        }

    }

    public void sellBook(String title, int quantity) throws InsufficientStockException, BookNotFound {
        Book book = findBook(title);
        if (!books.containsKey(book) || books.get(book) < quantity) {
            throw new InsufficientStockException("Nincs ilyen könyv");
        }
        books.put(book, books.get(book) - quantity);
        // vagy
        // books.replace(book, books.get(book) - quantity);
    }


    public Map<Book, Integer> getBooks() {
        return (Map<Book, Integer>) books;
    }

    public void setBooks(Map<Book, Integer> books) {
        this.books = (Map<Book, Integer>) books;
    }
}
