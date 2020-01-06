package LinkedList;

class Node{//结点
    private int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
//单链表
public class SingleLinkedList {
    Node head = null;
    //头插
    public void firstAdd(int data){
        Node node = new Node(data);
        //验证链表是否为空
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    //尾部插入
    public void lastAdd(int data){
        Node node = new Node(data);
        //链表是否为空
        if(head ==  null){
            head = node;
            return;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next  = node;
    }
    //下标处插入data
    public boolean addIndex(int index,int data){
        Node node = new Node(data);
        int size = getSize();
        //如果下标在链表长度之外或者下标不合法
        if(index < 0 || index > size){
            return false;
        }
        //如果index为0，相当于头插
        if(index == 0){
            firstAdd(data);
            return true;
        }
        //如梭下标等于size，相当于尾插
        if(index == size){
            lastAdd(data);
            return true;
        }
        //如果要插入在中间位置
        Node prev = head;
        //找要插入的位置的前一个位置
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    //获取链表长度
    private int getSize(){
        int size = 0;
        Node node = head;
        while(node != null){
            node = node.next;
            size++;
        }
        return size;
    }
    //查询是否存在某个关键值
    public boolean contains(int data){
        if(head == null){
            return false;
        }
        Node node = head;
        for (int i = 0; i < getSize(); i++) {
            if(data == node.getData()){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    //删除第一次出现的关键值
    public void remove(int data){
        if(head == null){
            return;
        }
        if(contains(data)) {
            //如果删除的是头节点
            if (head.getData() == data) {
                head = head.next;
                return;
            }
            //如果删除的是尾结点
            Node node = new Node(data);
            Node prev = searchPrev(node);
            if(prev.next.next == null){
                prev.next = null;
                return;
            }
            //如果删除的是中间结点
            prev.next = prev.next.next;
            return;
        }
    }
    //查找某个节点的前一个结点
    private Node searchPrev(Node node){
        if(head == null){
            return null;
        }
        Node prev = head;
        for(int i = 0;i < getSize();i++){
            if(node.getData() == prev.next.getData()){
                return prev;
            }
            prev = prev.next;
        }
        return prev;
    }
    //输出链表
    public String disPlay(){
        String ret = "";
        for(Node node = head;node != null;node = node.next){
            ret = ret + node.getData() + ",";
        }
        return ret;
    }
    //删除所有值为key的结点
    public void removeAllKey(int key){
        //只要还包含关键字，则删除一个
        while(contains(key)){
            remove(key);
        }
    }
    //清空链表
    public void clear(){
        head = null;
    }
    //返回链表长度
    public int size(){
        return getSize();
    }
    //再写一个插入，默认是尾部插入
    public void add(int data){
        lastAdd(data);
    }
}
