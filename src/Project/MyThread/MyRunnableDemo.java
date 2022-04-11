package Project.MyThread;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("a");
        t2.setName("B");

        t1.start();
        t2.start();
    }
}
