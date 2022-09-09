package books;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    public int isbn;
    private String author;
    private int price;
    private static int edition;

    @Override
    public int hashCode() {
        return title.hashCode()+author.hashCode()+price+edition;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && price == book.price;
    }

    @Override
    public String toString() {
        return "Title: "+title+
                "\nAuthor: "+author+
                "\nPrice: "+price+
                "\nEdition: "+edition;
    }

    public Book(String title, int isbn, String author, int price) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public Book() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(title,isbn,author,price);
    }

    @Override
    public int compareTo(Book b) {
        return isbn - b.isbn;
    }
}
