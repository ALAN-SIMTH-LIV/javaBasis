package day1.train3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 终端图书管理系统
        Library library = new Library();
        while (true){
            System.out.println("=== 图书馆管理系统 ===");
            System.out.println("1. 添加书籍");
            System.out.println("2. 借阅书籍");
            System.out.println("3. 归还书籍");
            System.out.println("4. 显示所有书籍");
            System.out.println("5. 退出");
            System.out.println("请选择操作：");
            Scanner choice = new Scanner(System.in);
            String choiceStr = choice.nextLine();
            if (choiceStr.equals("1")){
                System.out.println("请输入添加书籍数据: ");
                Scanner bookInfo = new Scanner(System.in);
                System.out.println("请输入书籍编号: ");
                String isbn = bookInfo.nextLine();
                System.out.println("请输入书籍书名: ");
                String title = bookInfo.nextLine();
                System.out.println("请输入书籍作者: ");
                String author = bookInfo.nextLine();
                Book book = new Book(isbn,title,author,false);
                library.addBook(book);
            } else if (choiceStr.equals("2")){
                System.out.println("请输入借阅书籍编号: ");
                String isbn = choice.nextLine();
                library.borrowBook(isbn);
            } else if (choiceStr.equals("3")){
                System.out.println("请输入归还书籍编号: ");
                String isbn = choice.nextLine();
                library.returnBook(isbn);
            } else if (choiceStr.equals("4")){
                library.displayAllBooks();
            } else if (choiceStr.equals("5")){
                System.out.println("成功退出");
                break;
            }
        }
    }
}
