package SeqList;

public class TestSeqList {
    private static void testDisplay(){
        SeqList seqlist = new SeqList();
        for (int i = 0; i < 100; i++) {
            seqlist.add(i);
        }
        seqlist.display();
        seqlist.add(50,200);
        seqlist.display();
    }
    private static void testContains(){
        SeqList seqlist = new SeqList();
        for (int i = 0; i < 100; i++) {
            seqlist.add(i);
        }
        System.out.println(seqlist.contains(50));
        System.out.println(seqlist.contains(200));
    }
    private static void testSearch(){
        SeqList seqlist = new SeqList();
        for (int i = 0; i < 100; i++) {
            seqlist.add(i);
        }
        System.out.println(seqlist.search(50));
        System.out.println(seqlist.search(200));
    }
    private static void testGetPos(){
        SeqList seqlist = new SeqList();
        for (int i = 0; i < 100; i++) {
            seqlist.add(i);
        }
        System.out.println(seqlist.getPos(50));
        System.out.println(seqlist.getPos(200));
    }
    private static void testRemove(){
        //给顺序表赋值为1到100
        SeqList seqlist = new SeqList();
        for (int i = 0; i < 100; i++) {
            seqlist.add(i);
        }
        seqlist.display();
        System.out.println();
        System.out.println(seqlist.size());
        seqlist.remove(50);
        seqlist.remove(100);
        seqlist.display();
        System.out.println(seqlist.size());
        seqlist.clear();
        System.out.println();
        seqlist.display();
        System.out.println(seqlist.size());
    }
    public static void main(String[] args) {
        //testDisplay();
        //testContains();
        //testSearch();
        //testGetPos();
        testRemove();
    }
}
