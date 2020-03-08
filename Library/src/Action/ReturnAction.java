package Action;

import Book.BookList;

public class ReturnAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("还书");
    }
}
