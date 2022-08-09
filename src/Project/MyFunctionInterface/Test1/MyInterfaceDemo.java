package Project.MyFunctionInterface.Test1;
/*
    函数式接口：
        有且仅有一个函数
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = ()-> System.out.println("函数式接口");
        my.show();
    }
}
