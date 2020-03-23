package DoubleLinkedList;

class Node{
    Node prev = null;
    int data;
    Node next = null;
    public Node(int data){
        this.data = data;
    }
}
public class DoubleLinkedList {
    Node head = null;
    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    public void display(){
        if(head == null){
            System.out.println("[ ]");
        }
        for(Node node = head;node != null;node = node.next){
            System.out.print(node.data+",");
        }
        System.out.println();
    }
    //尾插
    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        //这个循环只是为了找尾结点
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        //循环后tail就是尾结点
        tail.next = node;
        node.prev = tail;
    }
    //默认是尾插
    public void add(int data){
        addLast(data);
    }
    //指定下标位置的插入
    public void addIndex(int index,int data){
        if(index < 0 || index > size()){
            return;
        }
        Node node = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        Node cur = head;
        for(int i = 0;i<index;i++){
            cur = cur.next;
        }
        node.prev = cur.prev;
        cur.prev.next = node;
        node.next = cur;
        cur.prev = node;
    }
    //得到链表长度
    public int size(){
        //可以不用考虑空链表，下面的循环可以考虑到空链表的情况
        int size = 0;
        Node node = head;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
    }
    //查找关键字key是否包含在列表中
    public boolean contains(int key){
        if(head == null){
            return false;
        }
        for(Node node = head;node != null;node = node.next){
            if(node.data == key){
                return true;
            }
        }
        return false;
    }
    //找指定值为key的结点
    private Node findKey(int key){
        for(Node node = head;node != null;node = node.next) {
            if (node.data == key) {
                return node;
            }
        }
            return null;
    }
    //删除第一次出现关键字为key的值
    public void remove(int key){
        if(head == null){
            return;
        }
        Node node = findKey(key);
        //看看node是不是为空,要删除的值是否存在
        if(node == null){
            return;
        }
        if(node.prev == null){
            //如果node.prev为空则说明这是头节点
            head = head.next;
            head.prev = null;
            return;
        }
        if(node.next == null){
            //如果node.next为空则这是尾结点
            node.prev.next = null;
            node.prev = null;
            return;
        }
        //删除中间结点
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
    }
    //删除所有值为key的结点
    public void removeAll(int key){
        while(contains(key)){
            remove(key);
        }
    }
    public void clear(){//清除链表
        head = null;

    }
}
