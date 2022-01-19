package co.yunmc.java;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //[10,99]
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //求数组元素的最大值
        int maxValue = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为:" + maxValue);

        //求数组元素的最小值
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        System.out.println("最小值为:" + minValue);

        //求数组元素的总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为:" + sum);

        //求数组平均值
        int ave = 0;
        System.out.println("平均值:" + sum/arr.length);
    }
}
