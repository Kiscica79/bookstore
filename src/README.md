## 1. feladat ##

Készíts egy Book osztályt, aminek a fieldjei legyenek: title, author, price.
Írj konsturktort, gettereket, settereket, és írd felül a toString()-et!

Készíts egy BookNotFoundExceptiont!

Készíts egy Bookstore osztályt, ami könyvek listáját tárolja!
(Tehát legyen benne egy List<Book> books field!)
Valósíts meg benne az alábbi metódusokat:

void addBook(Book book)
Book findBook(String title) throws BookNotFoundException
void displayBooks()

A Main osztályt nevezd át BookstoreApplication-re, példányosíts benne egy Bookstore-t, adj hozzá legalább 3 könyvet!

Hívd meg a findBook metódust, kezeld le az előfordulható hibákat!

##  2. feladat ##

Alakítsd át a Bookstore osztályt, hogy egy Map-et tároljon, ami a könyveket és a darabszámukat tárolja el, módosítsd a szükséges metódusokat!

Írj egy InsufficientStockExceptiont!

Írj a Bookstore-ban egy alábbi szignatúrájú metódust:
public sellBook(String title, int quantity) throws InsufficientStockException

Próbáld ki a BookstoreApplicationben!


