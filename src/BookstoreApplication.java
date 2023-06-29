public class BookstoreApplication {
    public static <Bookstore> void main(String[] args) {

        BookStore bookstore = new BookStore("llllllllll", "llllllllllll", 33333);
        Book myFav = new Book("HHHHHHHHHH", "GGGGGGGGGG", 1234);


        bookstore.addBook(new Book("It ends with Us", "Colleen Hoover", 44));
        bookstore.addBook(new Book("It ends with Us", "Colleen Hoover", 15));
        bookstore.addBook(new Book("Confess", "Colleen Hoover", 12.00));
        bookstore.addBook(new Book("Maybe Someday", "Colleen Hoover", 10.99));


        try {
            System.out.println("The book is found : " + bookstore.findBook("l"));
        } catch (BookNotFound e) {
            System.out.println(e.getMessage());
        }
        try {
            bookstore.sellBook("Confess", 1);
            bookstore.sellBook("Maybe Someday", 1);
            bookstore.sellBook("It end with Us", 1);

        } catch (InsufficientStockException | BookNotFound e) {
            System.out.println(e.getMessage());
        }

        bookstore.displayBooks();


    }
}