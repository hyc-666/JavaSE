package Action;

import Book.Book;
import Book.BookList;

import java.util.ArrayList;
import java.util.Scanner;

public class DelAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("删除书籍");
        System.out.println("请输入关键字搜索");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.next();
        //在这里，由于是关键字查找的删除，于是，我们把包含有关键字的记录放到一个集合里，
        // 然后由用户的选择来确定需要删除的记录
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
        System.out.println("选择需要删除的条目：");
        int choice = scanner.nextInt();
        Book toDel = searchResult.get(choice);
        booklist.delete(toDel);
        System.out.println("删除完成");
    }
}
