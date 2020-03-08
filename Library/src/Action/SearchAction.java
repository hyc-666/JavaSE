package Action;

import Book.Book;
import Book.BookList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("查找书籍");
        System.out.println("请输入关键字以搜索需要借阅的书籍");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.next();
        ArrayList<Book> searchResult = new ArrayList<Book>();
        for (int i = 0; i < booklist.getSize(); i++) {
            if (booklist.getBook(i).toString().contains(search)){
                searchResult.add(booklist.getBook(i));//把含有关键字的加入到一个集合中
            }
        }
        //展示出搜索结果
        System.out.println("搜索结果：");
        for (int i = 0; i < searchResult.size(); i++) {
            System.out.println( i + ".  " + searchResult.get(i).toString());
        }
    }
}
