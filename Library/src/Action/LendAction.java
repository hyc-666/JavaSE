package Action;

import Book.Book;
import Book.BookList;

import java.util.ArrayList;
import java.util.Scanner;

public class LendAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("借书");
        //一样，还是根据关键字搜索，然后从搜索内容里选择需要借阅的书籍
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
        System.out.println("选择需要借阅的书籍：");
        int choice = scanner.nextInt();
        Book toLend = searchResult.get(choice);
        //查找到该藏书在booklist中的下标
        int index = booklist.getBook(toLend);
        if(toLend.isLend()){
            System.out.println("该书籍已被借阅");
            return;
        }else{
            toLend.setLend(true);
            booklist.setBook(index,toLend);
        }
        System.out.println("借阅成功");
    }
}
