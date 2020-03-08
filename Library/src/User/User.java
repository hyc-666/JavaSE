package User;

import Action.IAction;
import Book.BookList;

public abstract class User {
    protected String userName;//用户名
    protected IAction[] actions;//用户的操作，不同的用户身份操作不一样
    public abstract int menu();

    public abstract void doActions(int choice, BookList bookList);
}
