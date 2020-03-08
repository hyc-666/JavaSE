package Action;

import Book.BookList;

public class DisplayAction implements IAction {
    @Override
    public void work(BookList booklist) {
        System.out.println("书单：");
        for (int i = 0; i < booklist.getSize(); i++) {
            System.out.println(booklist.getBook(i).toString());
        }
    }
}
