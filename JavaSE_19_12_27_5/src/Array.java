public class Array {
    public static void main(String[] args) {
        //创建一个100个整型的数组
        int[] arr = new int[100];
        //赋值为一到一百
        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        //printArray(arr);
        int[] arr1 = transform(arr);
//        printArray(arr1);
        System.out.println(sum(arr));
        System.out.println(avg(arr));

    }
    //打印数组元素
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    //每个元素转换为2倍
    public static int[] transform(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] * 2;
        }
        return arr;
    }
    //所有元素的和
    public static int sum(int[] arr){
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        return ret;
    }
    //计算平均值
    public static double avg(int[] arr){
        double ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        return ret / arr.length;
    }
}
