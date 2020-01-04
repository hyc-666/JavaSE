package Course6;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] ab = new int[]{a,b};
        System.out.println(Arrays.toString(ab));
        swap(ab);
        System.out.println(Arrays.toString(ab));
    }
    //交换连个变量的值，
    public static void swap(int[] arr){//通过传参数为引用类型
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }
}
