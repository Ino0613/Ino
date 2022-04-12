package Project.Class.Class3;

public class ZhengzeDemo {

    public static void idTester(){
        //测试标识符的基本定义
        String[] testCases = {"A", "z26", "name", "student2", "2score","student_", "student_2"};
        boolean right;
        for (String str : testCases) {
            right = str.matches("[a-zA-Z0-9_]*$");
            if (right) {
                System.out.println(str + "是一个标识符");
            }else
                System.out.println(str + "不是一个标识符!");
        }
    }

    public static void main(String[] args) {
        idTester();
    }
}
