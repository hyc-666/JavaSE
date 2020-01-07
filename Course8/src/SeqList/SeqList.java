package SeqList;

public class SeqList {
    //顺序表长度初始化为0，只能通过调用方法向里面一个一个的添加元素
    private int size = 0;
    //这是顺序表容量，默认为100，如果不够可以扩容，一次扩大两倍
    private int[] list = new int[100];
    //打印输出顺序表内容
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d,",list[i]);
            if((i+1)%40 == 0){//输出每40个一行
                System.out.println();
            }
        }

        System.out.println();
    }
    //在pos下标处插入值为data的元素
    public void add(int pos,int data){
        //下标位置是否合法
        //注意这里如果位置是size的话是合法的，表示插入到最后
        if(pos < 0 || pos > size){
            return;
        }
        //是否需要扩容
        if(size + 1 > list.length){
            list = addList();
        }
        //插入到指定位置
        for (int i = size; i >= pos; i--) {
            list[i+1] = list[i];
        }
        list[pos] = data;
        size++;//每次插入操作以后要记得size++
    }
    //普通插入，默认插入到最后
    public void add(int data){
        //还是要先检测是否需要扩容
        if(size + 1 > list.length){
            list = addList();
        }
        list[size] = data;//size是表长度，也是最后一个元素的下一个元素的下标
        size++;
    }
    //扩容
    private int[] addList(){
        int[] list_add = new int[list.length * 2];//一次扩容两倍
        for (int i = 0; i < list.length; i++) {
            list_add[i] = list[i];
        }
        return list_add;
    }
    //查找是否包含某个值
    public boolean contains(int toFind){
        //这个循环可以保证当size为0的时候下标list[i]不会越界
        //当size = 0的时候i<size是不成立的，不会进入循环
        for (int i = 0; i < size; i++) {
            if(list[i] == toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for (int i = 0; i < size; i++) {
            if(list[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //返回pos下标位置的元素
    public int getPos(int pos){
        //注意查找的时候这里的位置size是不合法的
        if(pos < 0 || pos >= size){
            return -1;
        }
        return list[pos];
    }
    //给pos为的元素的值设为value
    public void setPos(int pos,int value){
        if(pos < 0 || pos >= size){
            return;
        }
        list[pos] = value;
    }
    //删除第一次出现的关键字为key的值
    public void remove(int toRemove){
        //检测要删除的值是否存在
        if(contains(toRemove)){//如果存在则删除
            for (int i = search(toRemove); i < size-1; i++) {
                list[i] = list[i+1];
            }
            size--;
        }
    }
    //获取顺序表长度
    public int size(){
        return size;
    }
    //清空顺序表
    public void clear(){
        size = 0;//直接把size值修改为0表示顺序表中已没有元素
    }
    //当然，缩容就不必要了，一般很少缩容
    //这种扩容缩容的操作要涉及到值拷贝的问题，比较浪费资源，
    //没有必要的情况下不会考虑这种操作
}
