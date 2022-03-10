package Project.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<Student>();
        while(true){

        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择:");

        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        switch (line){
            case "1":
                System.out.println("添加学生");
                addStudent(s);
                break;
            case "2":
                System.out.println("删除学生");
                delStudent(s);
                break;
            case "3":
                System.out.println("修改学生");
                updateStudent(s);
                break;
            case "4":
                System.out.println("查看所有学生");
                findAllStudent(s);
                break;
            case "5":
                System.out.println("谢谢使用");
                System.exit(0);
            default:
                System.out.println("输入错误请重新输入");
          }
        }
    }

    public static void updateStudent(ArrayList<Student> s1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号:");
        String sid = sc.next();
        int index = -1;
        for (int i = 0; i < s1.size(); i++) {
            Student s = s1.get(i);
            if (s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("学生学号不存在");
        }else{
            System.out.println("请输入学生新姓名:");
            String name = sc.next();
            System.out.println("请输入学生新年龄：");
            String age = sc.next();
            System.out.println("请输入学生新居住地：");
            String address = sc.next();

            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            for (int i = 0; i < s1.size(); i++) {
                Student student = s1.get(i);
                if (student.getSid().equals(sid)) {
                    s1.set(i, s);
                    System.out.println("修改学生信息成功");
                    break;
                }
            }
        }

    }

    public static void findAllStudent(ArrayList<Student> s1) {
        System.out.println("学号\t\t姓名\t\t年龄\t居住地");
//        for (int i = 0; i < s1.size(); i++){
//            Student s = s1.get(i);
//            System.out.println(s.getSid() + "\t" +s.getName() + "\t" +
//                    s.getAge() + "\t"+ s.getAddress());
//        }
        for (Student s : s1){
            System.out.println(s.getSid() + "\t" +s.getName() + "\t" +
                    s.getAge() + "\t"+ s.getAddress());
        }

    }

    public static void delStudent(ArrayList<Student> s1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号");
        String sid = sc.nextLine();
        int index = -1;
//        for (Student s:s1){
//            if (s.getSid().equals(sid)){
//                s1.remove(s);
//                System.out.println("删除学生成功");
//                break;
//            }
//        }
        for (int i = 0; i < s1.size(); i++) {
            Student s = s1.get(i);
            if (s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("学生学号不存在请重新输入");

        }else{
            s1.remove(index);
            System.out.println("删除学生成功");
        }
        }

    public static boolean isUsed(ArrayList<Student> s1,String sid) {
        boolean flag = false;
        for (int i = 0; i < s1.size(); i++) {
            Student sd = s1.get(i);
            if (sd.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void addStudent(ArrayList<Student> s1) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true){
            System.out.println("请输入学生学号：");
            sid = sc.next();
            boolean flag = isUsed(s1,sid);
            if (flag){
                System.out.println("你输入的学号已经被使用，请重新输入");
            }else{
                break;
            }
          }
              System.out.println("请输入学生姓名：");
              String name = sc.next();
              System.out.println("请输入学生年龄：");
              String age = sc.next();
              System.out.println("请输入学生居住地：");
              String address = sc.next();

              //创建学生对象，把键盘录入的数值赋值给学生对象的成员变量
              Student s = new Student();
              s.setSid(sid);
              s.setName(name);
              s.setAge(age);
              s.setAddress(address);
              s1.add(s);
        }

}
