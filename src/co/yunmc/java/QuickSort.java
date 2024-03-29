package co.yunmc.java;

/*
    1.选择排序
        - 直接选择排序、推排序
    2.交换排序
        - 冒泡排序、快速排序
    3.插入排序
        - 直接插入排序、折半插入排序、Shell排序
    4.归并排序

 */
public class QuickSort {
    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0);
                while (high >start && data[--high] - base >=0) ;
                if (low < high) {
                    swap(data, low, high);
                }else{
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用
            subSort(data, high + 1, end);
        }
    }

    public static void quickSort(int[] data) {
        subSort(data, 0, data.length - 1);
    }

    public static void main(String[] args) {
        int[] data = {9, -16, 30, 23, -30, -49, 25, 21, 30};
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }

}
