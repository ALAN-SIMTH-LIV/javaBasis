package day1.train3;

import java.util.HashMap;
import java.util.Map;

public class Library {

    public Map<String,Book> books = new HashMap<>();

    public void addBook(Book book){
        books.put(book.getIsbn(),book);
    }

    public void borrowBook(String isbn){
        try{
            Book book = books.get(isbn);
            if (book == null){
                throw new BookNotFoundException("该书不存在系统中");
            }
            if (true == book.getBorrowed()){
                throw new BookAlreadyBorrowedException("该书已被借走");
            }
            book.setBorrowed(true);
            System.out.println("借阅成功");
        } catch (BookNotFoundException | BookAlreadyBorrowedException e){
            System.out.println(e.getMessage());
        }

    }

    public void returnBook(String isbn){
        try{
            Book book = books.get(isbn);
            if (book == null){
                throw new BookNotFoundException("该书不存在系统中");
            }
            if (false == book.getBorrowed()){
                throw new BookNotBorrowedException("该书未被借走");
            }
            book.setBorrowed(false);
            System.out.println("归还成功");
        } catch (BookNotFoundException | BookNotBorrowedException e){
            System.out.println(e.getMessage());
        }
    }

    public void displayAllBooks(){
        if (books.isEmpty()){
            System.out.println("当前图书馆没有书籍");
            return;
        }

        System.out.println("=== 所有书籍 ===");
        for (Book book : books.values()){
            System.out.println(book);
        }
    }
}

