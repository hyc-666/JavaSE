package User;

import Action.*;
import Book.BookList;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        this.userName = name;
        this.actions = new IAction[]{
                new ExitAction(),
                new AddAction(),
                new DelAction(),
                new SearchAction(),
                new DisplayAction()
        };
    }

    @Override
    public int menu() {
        System.out.println("=================");
        System.out.println("====欢迎管理员====");
        System.out.println(" 0. 退出 ");
        System.out.println(" 1. 增加书籍");
        System.out.println(" 2. 删除书籍");
        System.out.println(" 3. 查询书籍");
        System.out.println(" 4. 查看所有书单");
        System.out.println("=================");
        System.out.print("请选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void doActions(int choice, BookList bookList) {
        actions[choice].work(bookList);
    }
}
