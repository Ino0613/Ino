package co.yunmc.java;

public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30 ) +1;
            boolean flag = false;
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag =true;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = (int) (Math.random() * 30 + 1);
                    flag = false;
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Math.random());
    }
}
