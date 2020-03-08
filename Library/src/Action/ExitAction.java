package Action;

import Book.BookList;

public class ExitAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("退出");
        System.exit(0);
    }
}
