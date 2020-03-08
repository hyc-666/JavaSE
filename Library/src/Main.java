import Book.BookList;
import User.User;
import User.Admin;
import User.NormalUser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建用户
        User user = login();
        //创建书单
        BookList bookList = new BookList();
        while (true){
            int choice = user.menu();
            user.doActions(choice,bookList);
        }
    }

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名:");
        String userName = scanner.next();
        System.out.println("确定身份：");
        System.out.println(" 0: 管理员         1： 普通用户");

        int choice = scanner.nextInt();
        if (choice == 0){
            return new Admin(userName);
        }else{
            return new NormalUser(userName);
        }
    }
}
