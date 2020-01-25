package Holiday01;

public class TestString {
    public static void main(String[] args) {
        String str = "hello Word";
        System.out.println(toLowerCase(str));
    }
    //将字符串中的大写字母转换为小写字母
    public static String toLowerCase(String str){
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'A' && data[i] <= 'Z') {
                data[i] += 32;
            }
        }
        String str2 = new String(data);
        return str2;
    }
    //将数组中的元素向右移动k个单位，k为非负数

}
