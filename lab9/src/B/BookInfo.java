package B;

public class BookInfo {
    String bookName,bookAuthor;
    int createBookCount,payBook,bookId;

    public int getCreateBookCount() {
        return createBookCount;
    }

    public void setCreateBookCount() {
        this.createBookCount--;
    }

    public BookInfo(String bookName, String bookAuthor, int bookId, int payBook, int createBookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.createBookCount = createBookCount;
        this.payBook = payBook;
        this.bookId = bookId;
    }
}
