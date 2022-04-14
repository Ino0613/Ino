package Project.Class.Test;



public class Student {
    String name;
    int age;
    String num;

    Student(String name, int age, String num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }
    Student(){
    }

    public static void main(String[] args) {
        String s1 = "80";
        String s2 = "20";
        System.out.println(s1 + s2);
        Double d1 = new Double(s1);
        Double d2 = new Double(s2);
        System.out.println(d1.doubleValue());
        System.out.println(d2.doubleValue());
        System.out.println(d1 + d2);
    }
}
