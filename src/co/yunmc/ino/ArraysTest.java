package co.yunmc.ino;
import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        //1.boolean equals(int[] a,int[] b); 判断两个数组是否相等
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{1,3,2,4};
        boolean isEquals = Arrays.equals(a,b);
        System.out.println(isEquals);

        //2.String toString(int[] a); 输出数组信息
        System.out.println(Arrays.toString(a));

        //3.void fill(int[] a,int val); 将指定值填充到数组中
        Arrays.fill(a,10);
        System.out.println(Arrays.toString(a));

        //4.void sort(int[] a); 对数组进行排序
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //5.int binarySearch(int[] a1,int)
        int[] a1 = new int[]{-98, 31, -44, 0, 13, 45, 2, 35, 48, 64, 13, 111, 23};
        int index = Arrays.binarySearch(a1, 0);
        System.out.println(index);


    }

}
