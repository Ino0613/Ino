package Project.MyMethodReference.Test3;
/*
    练习:
        1.定义一个接口(MyString),里面定义一个抽象方法
            String mySubString(String s,int x,int y);
        2.定义一个测试类,两个方法
            useMyString(MyString my)
        一个方法是主方法，在主方法中调用useMyString方法
 */
public class StringDemo {
    public static void main(String[] args) {
        useMyString((s,x,y)->{
            System.out.println("");
            return s;
        });
        useMyString((String s,int x,int y)->{
            return s.substring(x,y);
        });

        useMyString(String::substring);
    }

    public static void useMyString(MyString my) {
        String s = my.mySubString("111222", 1, 3);
        System.out.println(s);
    }
}
