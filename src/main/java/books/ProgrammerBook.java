package books;

public class ProgrammerBook extends Book{
    private String language;

    public ProgrammerBook(String title, int isbn, String author, int price, String language, int level) {
        super(title, isbn, author, price);
        this.language = language;
        this.level = level;
    }

    public ProgrammerBook() {
    }

    private int level;

    @Override
    public int hashCode() {
        return super.hashCode()+language.hashCode()+level;
    }

    @Override
    public boolean equals(Object obj) {
        ProgrammerBook book = (ProgrammerBook) obj;
        return super.equals(obj) && language.equals(book.language) && level==book.level;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nLanguage: "+language+
                "\nLevel: "+level;
    }
}
