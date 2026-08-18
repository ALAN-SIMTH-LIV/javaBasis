package day1.train3;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private Boolean isBorrowed;

    public Book(){}

    public Book(String isbn, String title, String author, Boolean isBorrowed) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString(){
        return "编号:" + isbn + " 书名:" + title + " 作者: " + author + (isBorrowed?" 已被借走":" 未被借走");
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }
}
