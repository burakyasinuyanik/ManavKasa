import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String bookName;
    private int bookPage;
    private String bookWriter;
    private int bookDate;

    public Book(String bookName, int bookPage, String bookWriter, int bookDate) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.bookWriter = bookWriter;
        this.bookDate = bookDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public int getBookDate() {
        return bookDate;
    }

    public void setBookDate(int bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public int compareTo(Book o) {
        return bookName.compareTo(o.bookName);
    }
}
