package Project.MyInterface.Test2;
/*
    需求：
        1.
        2.
        3.定义测试类：
            在主方法中，按照多态的方式创建对象
 */
public class InterDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        Inter i = new InterImpl();
        i.show1();
        System.out.println("=========");
        i.show2();

        Inter.method1();
        System.out.println("=========");
        Inter.method2();
    }
}
