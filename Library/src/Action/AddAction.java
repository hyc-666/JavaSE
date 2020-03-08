package Action;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class AddAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("增加书籍");
        System.out.println("输入书籍信息：");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        System.out.println("作者：");
        String author = scanner.next();
        System.out.println("书籍类型:");
        String type = scanner.next();
        System.out.println("书籍定价：");
        double price = scanner.nextDouble();
        booklist.addBook(new Book(bookName,author,type,price));
        System.out.println("添加完成");
    }
}
