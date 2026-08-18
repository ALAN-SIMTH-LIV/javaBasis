package day1.train3;

public class BookAlreadyBorrowedException extends Exception{
    public BookAlreadyBorrowedException() {
    }

    public BookAlreadyBorrowedException (String message){
        super(message);
    }

    public BookAlreadyBorrowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookAlreadyBorrowedException(Throwable cause) {
        super(cause);
    }
}
