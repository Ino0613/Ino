package co.yunmc.ino;

public class Student {

    public static String name;
    public static String num;
    public static int age;

    public static void Speak(){
        System.out.printf("说英语");
    }
    public static void Study(String name, String num){
        System.out.println("学生 "+ name + " "+ "学号:" + num);
    }

    public static void main(String[] args) {
        name = "张三";
        num = "2020210000";
        System.out.print("姓名:" + name+ " " + "学号:" + num + " ");
        Speak();
        Study("李四","2020210001");
        int x =1,y=6;
        while(y-->0){
            x--;
        }
        System.out.println(y);
    }

    public  void Message(){
        System.out.println("Message");
    }
}
