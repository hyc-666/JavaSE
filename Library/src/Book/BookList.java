package Book;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> books = new ArrayList<Book>();
    private int size;

    public BookList() {
        books.add(new Book("三国演义","罗贯中","古典名著",100.0));
        books.add(new Book("西游记","吴承恩","古典名著",100));
        books.add(new Book("遮天","辰东","网络小说",50));
        books.add(new Book("朝花夕拾","鲁迅","当代散文集",60));
//        size = 4;
    }

    public int getSize() {
        return books.size();
    }

    public void setSize(int size) {
        this.size = books.size();
    }
    public Book getBook(int index){
        if (index >= books.size() || index < 0){
            return null;
        }
        return books.get(index);
    }
    public void setBook(int index,Book book){
        if (index >= books.size() || index < 0){
            return;
        }
       books.set(index,book);
    }
    //增加新书
    public void addBook(Book book){
        books.add(book);
    }
    //删除书籍
    public void delete(Book book){
        books.remove(book);
    }
    public int getBook(Book book){
        return books.indexOf(book);
    }
}
