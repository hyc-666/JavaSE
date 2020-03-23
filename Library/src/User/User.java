package User;

import Action.IAction;
import Book.BookList;

public abstract class User {
    protected String userName;//用户名
    protected IAction[] actions;//用户的操作，不同的用户身份操作不一样
    protected int identity;//用来标识用户身份

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public abstract int menu();

    public abstract void doActions(int choice, BookList bookList);
}
