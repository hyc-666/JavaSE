package DoubleLinkedList;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        //testFirstAdd();
        //testLastAdd();
        //testIndexAdd();
        testRemove();
    }
    private static void testFirstAdd(){
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();
    }
    private static void testLastAdd(){
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.display();
    }
    private static void testIndexAdd(){
        DoubleLinkedList list = new DoubleLinkedList();
//        list.addLast(5);
//        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.display();
        list.addIndex(2,100);
        list.display();
        list.addIndex(5,200);
        list.display();
    }
    private static void testRemove(){
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.remove(50);
        list.remove(5);
        list.remove(1);
        list.remove(3);
        list.display();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.display();
        list.removeAll(4);
        list.display();
        list.clear();
        list.display();
    }
}
