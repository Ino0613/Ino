package Project.Random;

import java.util.Random;

public class CalCulate_2 {
    static String[] e = new String[50];
    static short[] r = new short[50];
    static short count = 0;

    public static void printHeader(){
        /*
            简单说明作用和使用方法
         */
        System.out.println("====================================");
        System.out.println("- 程序输出50道100以内的加减法算式");
        System.out.println("- 每次运行程序可得到一套59道题的习题及答案");
        System.out.println("====================================");
    }
    public static void generateExerciseOfAdditionEquations(){
        int m ,n;
        n = generateOperand();
        m = generateOperand();
        e[count] = n + " + " + m + " = ";
        r[count++] = (short) (n + m);
    }

    private static void generateExerciseOfSubstactEquations() {
        int m ,n;
        n = generateOperand();
        m = generateOperand();
        e[count] = n + " - " + m + " = ";
        r[count++] = (short) (n - m);
    }

    public static int generateOperand() {
        //生成100以内的整数
        Random random= new Random();
        return (short) random.nextInt(101);
    }

    public static void generateEquations(){
        /*
            产生加减法算式的符号串并存入数组
            生成算式时检查是否有重复
         */
        short m = 0, n = 0, v = 0, ov ;
        char o = '+';
        String sum;
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            ov = (short) random.nextInt(2);
            if (ov == 1) {
                generateExerciseOfAdditionEquations();
            }else{
                generateExerciseOfSubstactEquations();
            }
        }

    }




    private static boolean ArraySearch(String[] e, String sum) {
        boolean flag = false;
        //定义一个查找结果标志
        for (int i = 0; i < e.length; i++) {
            //字符串比较需要equals()方法
            if (sum.equals(e[i])) {
                flag = true;
                //一旦找到，flag改为true,退出循环
                break;
            }
        }
        return flag;
    }

    public static void printExercise(){
        /*
            接受gE()输出,并打印输出所有算式
         */
        for (int i = 1; i <= e.length; i++) {
            System.out.println("" + (i) + ":\t" + e[i- 1]);

        }
    }

    public static void printCalculations(){
        for (int i = 1; i <= r.length; i++) {
            System.out.println("" + (i) + ":\t" + r[i-1]);

        }
    }

    public static void main(String[] args) {
        printHeader();
        generateEquations();
        printExercise();
        System.out.println();
        System.out.println("----------------------");
        System.out.println("- 习题答案  ");
        printCalculations();
    }
}
