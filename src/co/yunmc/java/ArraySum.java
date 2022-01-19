package co.yunmc.java;

public class ArraySum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);
        /*
          杨辉三角形
         */

        //1.声明并初始化二维数组
        int[][] yanghui = new int[10][];
        //2.给数组元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            //2.1给首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            //2.2给非首末元素赋值
            //if (i> 1) {
                for (int j = 1; j < yanghui[i].length - 1; j++) {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            //}
        }
        //3.遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] +" ");
            }
            System.out.println();
        }
    }
}
