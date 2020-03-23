package User;

import Book.BookList;

import java.util.ArrayList;

public class Root extends User {//超级用户
    ArrayList<User> users = new ArrayList<User>();
     public Root(){
         identity = 0;
         users.add(new Admin("admin1"));
         users.add(new Admin("admin2"));
         users.add(new NormalUser("user1"));
         users.add(new NormalUser("user2"));
     }
    @Override
    public int menu() {
        return 0;
    }

    @Override
    public void doActions(int choice, BookList bookList) {

    }
}
