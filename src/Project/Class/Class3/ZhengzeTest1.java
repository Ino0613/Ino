package Project.Class.Class3;

public class ZhengzeTest1 {

    public static void test(){
        //����������ַ�
        String testCases = "��ֵ��ַ���51+11," +
                "[ 19+  A 45," +
                " 92+8,         ?80+19,         73+10;���ܵõ���ȷ�����?";
        String temp = testCases.replaceAll("[\\s\\D\\p{Punct}&&[^\\,+-]]", "");
        for (String s : temp.split("\\,")) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        test();
//        test2();
//        stairAccess2(60);
    }
    public static void test2(){
        int[] score = {-120, 98, 89, 120, 99};
        int sum = 0;
        for (int number : score) {
            assert number > 0 : "���������ǳɼ�";
            sum += number;
        }
        System.out.println("�ܳɼ�:" + sum);
    }

    public static void stairAccess2(int score){
        String[] grades = {"������", "����", "�е�", "����", "����"};
        int[] ranges = {60, 70, 80, 90, 100};
        int maxLevel = grades.length - 1; //4
        int gradesLevel = 0;
        String grade = "������";
        while (gradesLevel <= maxLevel && score > ranges[gradesLevel]) {
            gradesLevel++;
        }
        grade = grades[gradesLevel];
        System.out.println(maxLevel);
        System.out.println(score + "�ֶ�Ӧ�ĳɼ�" + grade + ".");
    }
}
