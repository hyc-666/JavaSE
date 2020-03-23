package homework;

import java.util.Scanner;

public class Login {
    static String name = "username";
    static String password = "123456";
    public static void main(String[] args) {
        try {
            if (userName() && passWord()){
                System.out.println("登陆成功！");
            }
        } catch (UserNameWrongException ex) {
            System.out.println(ex.getMessage());
        } catch (PassWordWrongException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static boolean userName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
       if (name.equals(username)){
           return true;
       }else{
           throw new UserNameWrongException();
       }
    }
    public static boolean passWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码：");
        String pass = scanner.next();
        if (password.equals(pass)){
            return true;
        }else{
            throw new PassWordWrongException();
        }
    }
}
