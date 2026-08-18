package day1.train3;

public class BookNotBorrowedException extends RuntimeException {
    public BookNotBorrowedException() {
    }

    public BookNotBorrowedException(String message) {
        super(message);
    }

    public BookNotBorrowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotBorrowedException(Throwable cause) {
        super(cause);
    }
}
