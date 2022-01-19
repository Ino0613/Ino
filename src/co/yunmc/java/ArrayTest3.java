package co.yunmc.java;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] array2 ;
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        //复制数组
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=array1[i];
            System.out.print(array2[i] + "\t");
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;

        }

        System.out.println();

        String[] str = new String[]{"a","b","c","d","e","f"};
        //数组的复制
        String[] str1 = new String[str.length];
        for (int i = 0; i < str1.length; i++) {
            str1[i] = str[i];
            System.out.print(str1[i]+ "\t");
        }
        System.out.println();
        //数组的反转
        //方法一
        for (int i = 0; i < str.length/2; i++) {
            String temp = str[i];
            str[i] = str[str.length - i -1 ];
            str[str.length - i - 1] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + "\t");
        }
        System.out.println();
        System.out.println();
        //方法二
        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + "\t");
        }
        System.out.println();
        for (int j = str.length-1 ; j >= 0; j--) {
            System.out.print(str[j] + "\t");
        }
        System.out.println();

        //查找（或搜索）
        // 线性查询:
        String dest = "c";
        boolean isFlag = true;
        for (int i = 0; i < str.length; i++) {
            if (dest.equals(str[i])) {
                System.out.println("找到了指定元素L:位置为" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("未能找到该元素！");
        }
        //二分法查找：
        //前提：所要查找的数组必须有序。
        int[] arr = new int[]{-98, -33, -12, 0, 3, 6, 8, 31};
        int arr1 = 0;
        int head = 0;//初始的首索引
        int end = arr.length - 1;//初始的末索引

        while (head <= end) {
            int middle = (head + end) / 2;
            if (arr1 == arr[middle]) {
                System.out.println("找到了指定元素L:位置为" + middle);
                break;
            } else if (arr[middle] > arr1) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }

    }
}
