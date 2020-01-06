package LinkedList;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        //testFirstAdd();
        //testLastAdd();
        //testIndexAdd();
        //testContains();
        //testRemove();
        testRemoveAllKey();
    }
    //测试代码方法
    private static void testFirstAdd(){
        SingleLinkedList sln1 = new SingleLinkedList();
        sln1.firstAdd(5);
        sln1.firstAdd(4);
        sln1.firstAdd(3);
        sln1.firstAdd(2);
        sln1.firstAdd(1);
    }
    private static void testLastAdd(){
        SingleLinkedList sln1 = new SingleLinkedList();
        sln1.lastAdd(5);
        sln1.lastAdd(4);
        sln1.lastAdd(3);
        sln1.lastAdd(2);
        sln1.lastAdd(1);
    }
    private static void testIndexAdd(){
        SingleLinkedList sln1 = new SingleLinkedList();
        sln1.firstAdd(5);
        sln1.firstAdd(4);
        sln1.firstAdd(3);
        sln1.firstAdd(2);
        sln1.firstAdd(1);//1,2,3,4,5
        sln1.addIndex(2,100);//1,2,100,3,4,5
        sln1.addIndex(0,200);//200,1,2,100,3,4,5
        sln1.addIndex(4,300);//200,1,2,100,300,3,4,5
    }
    private static void testContains(){
        SingleLinkedList sln1 = new SingleLinkedList();
        sln1.firstAdd(5);
        sln1.firstAdd(4);
        sln1.firstAdd(3);
        sln1.firstAdd(2);
        sln1.firstAdd(1);//1,2,3,4,5
        sln1.addIndex(2,100);//1,2,100,3,4,5
        sln1.addIndex(0,200);//200,1,2,100,3,4,5
        sln1.addIndex(4,300);//200,1,2,100,300,3,4,5
        System.out.println(sln1.contains(15));
        System.out.println(sln1.contains(300));
        System.out.println(sln1.contains(5));

    }
    private static void testRemove(){
        SingleLinkedList sln1 = new SingleLinkedList();
        sln1.firstAdd(5);
        sln1.firstAdd(4);
        sln1.firstAdd(3);
        sln1.firstAdd(2);
        sln1.firstAdd(1);//1,2,3,4,5
        sln1.remove(3);//1,2,4,5
        System.out.println(sln1.disPlay());
        sln1.firstAdd(2);//2,1,2,4,5
        System.out.println(sln1.disPlay());
        sln1.remove(2);//1,2,4,5
        System.out.println(sln1.disPlay());
        sln1.remove(5);
        System.out.println(sln1.disPlay());
    }
    private static void testRemoveAllKey(){
        SingleLinkedList sln1 = new SingleLinkedList();
        sln1.firstAdd(5);
        sln1.firstAdd(4);
        sln1.firstAdd(3);
        sln1.firstAdd(2);
        sln1.firstAdd(1);//1,2,3,4,5
        sln1.firstAdd(3);//3,1,2,3,4,5
        sln1.add(3);//3,1,2,3,4,5,3
        System.out.println(sln1.disPlay());
        System.out.println(sln1.size());
        sln1.removeAllKey(3);
        System.out.println(sln1.disPlay());
        sln1.clear();
        System.out.println(sln1.disPlay());
    }

}
