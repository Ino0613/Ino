package Project;

import java.util.Scanner;

public class Utility {

    private static Scanner sc = new Scanner(System.in);
// 用于界面菜单的选择，该方法读取键盘，如果用户输入'1-4'中
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.println("选择错误，请重新输入:");
            } else break;
        }
        return c;
    }

    private static String readKeyBoard(int limit) {
        String line ="";

        while (sc.hasNext()) {
            line = sc.nextLine();
            if (line.length() <  1 || line.length() > limit) {
                System.out.print("输入长度（不大于 " + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }




    //  用于收入和支出金额的输入。 该方法从键盘读取一个不超过4位长度的正数，并将其作为方法的返回值
    public static int readNember() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入:");
            }
        }
        return n;
    }

    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }

    public static char readConfirmSelection(){
        char c;
        for(; ;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入:");
            }
        }
        return c;
    }
}
