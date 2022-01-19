package co.yunmc.java;

public class ArrayTest1 {
    public static void main(String[] args) {
        String[][] arra1 = new String[3][1];
        int[][] arra2 = new int[][]{{1, 2}, {3, 4,5,6}, {5, 6,7}};
        System.out.println(arra2[0].length);
        for (int i = 0; i < arra2.length; i++) {
            for (int j = 0; j < arra2[i].length; j++) {
                System.out.print(arra2[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
