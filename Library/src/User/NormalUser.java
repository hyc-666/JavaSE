package User;

import Action.*;
import Book.BookList;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        this.userName = name;
        this.actions = new IAction[]{
                new ExitAction(),
                new SearchAction(),
                new LendAction(),
                new ReturnAction(),
                new DisplayAction()
        };
    }

    @Override
    public int menu() {
        System.out.println("===================");
        System.out.println("欢迎使用图书馆管理系统");
        System.out.println(" 0. 退出");
        System.out.println(" 1. 查阅书籍");
        System.out.println(" 2. 借书");
        System.out.println(" 3. 还书");
        System.out.println(" 4. 浏览所有书籍信息");
        System.out.println("===================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void doActions(int choice, BookList bookList) {
        actions[choice].work(bookList);
    }
}
