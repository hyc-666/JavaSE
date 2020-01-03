public class Array_practice {
    public static void main(String[] args) {
        int[] array = new int[]{13,18,15,6};
        System.out.println(toString(array));
        int[] arr = copyOf(array);
        System.out.println(toString(arr));
        System.out.println(isSorted(arr));
        bubbleSort(arr);
        System.out.println(toString(arr));

    }
    //现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    //返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] arr){
        String ret = "[";
        for (int i = 0; i <arr.length-1; i++) {
            ret = ret + arr[i] +", ";
        }
        ret = ret + arr[arr.length-1]+"]";
        return ret;
    }
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int[] arr){
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //给定一个有序整型数组, 实现二分查找
    //查到返回下标，没有查到返回-1
    public static int binarySearch(int[] arr,int x){
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int mid = (left + right)>>1;
            if(x < arr[mid]){
                right = mid -1;
            }
            else if(x>arr[mid]){
                left = mid + 1;
            }
            else
                return mid;
        }
        return -1;

    }
    //给定一个整型数组, 判定数组是否有序
    public static String isSorted(int[] arr){
        if(arr[0]>=arr[1]){
            for (int i = 1; i < arr.length-1; i++) {
                if(arr[i]>=arr[i+1]){
                    continue;
                }
                else{
                    return "无序";
                }

            }
            return "降序";
        }
        else if(arr[0]<=arr[1]){
            for (int i = 1; i < arr.length-1; i++) {
                if(arr[i]<=arr[i+1]){
                    continue;
                }
                else{
                    return "无序";
                }

            }
            return "升序";
        }
        return "无序";
    }
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }

}
