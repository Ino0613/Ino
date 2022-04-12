package Project.Class.Class3;

public class ZhengzeTest1 {

    public static void test(){
        //消除多余的字符
        String testCases = "奇怪的字符串51+11," +
                "[ 19+  A 45," +
                " 92+8,         ?80+19,         73+10;你能得到正确结果吗?";
        String temp = testCases.replaceAll("[\\s\\D\\p{Punct}&&[^\\,+-]]", "");
        for (String s : temp.split("\\,")) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        test2();
        stairAccess2(60);
    }
    public static void test2(){
        int[] score = {-120, 98, 89, 120, 99};
        int sum = 0;
        for (int number : score) {
            assert number > 0 : "负数不能是成绩";
            sum += number;
        }
        System.out.println("总成绩:" + sum);
    }

    public static void stairAccess2(int score){
        String[] grades = {"不及格", "及格", "中等", "良好", "优秀"};
        int[] ranges = {60, 70, 80, 90, 100};
        int maxLevel = grades.length - 1; //4
        int gradesLevel = 0;
        String grade = "不及格";
        while (gradesLevel <= maxLevel && score > ranges[gradesLevel]) {
            gradesLevel++;
        }
        grade = grades[gradesLevel];
        System.out.println(maxLevel);
        System.out.println(score + "分对应的成绩" + grade + ".");
    }
}
