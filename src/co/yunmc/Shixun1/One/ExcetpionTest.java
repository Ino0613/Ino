package co.yunmc.Shixun1.One;

abstract class ExceptionTest {

    public static void test() throws ClassNotFoundException {
        Class.forName("Student");
        System.out.println("test方法");
    }

    public static void main(String[] args) {
        try {
            Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            test();
            System.out.println("test方法调用完毕");
        } catch (ClassNotFoundException e) {
            System.out.println("运行test方法，发生报错");
            e.printStackTrace();
        } finally {
            System.out.println("我是你爸爸");
        }

    }
//    java.io包下面的
//    字节输入流 InputStream
//    字节输出流 OutputStream
//    字符输入流 Reader
//    字符输出流 Writer
    public abstract int read();

}


