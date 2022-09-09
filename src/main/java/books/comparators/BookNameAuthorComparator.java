package books.comparators;

import books.Book;

import java.util.Comparator;

public class BookNameAuthorComparator  implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if(result!=0) return result;
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
