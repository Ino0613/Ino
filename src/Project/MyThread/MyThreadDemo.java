package Project.MyThread;
/*
    方式1: 继承Thread类
        1.定义一个类MyThread继承Thread类
        2.在MyThread类中重写run()方法
        3.创建MyThread类对象
        4.启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
        Mythread m2 = new Mythread();
//        m1.run();
//        m2.run();
        m1.setName("INO1");
        m2.setName("INO2");
        //void start()  导致此线程开始执行；  Java虚拟机调用此线程的run方法
        m1.start();
        m2.start();
    }
}
