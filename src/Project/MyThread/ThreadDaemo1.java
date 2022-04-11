package Project.MyThread;

public class ThreadDaemo1 {
    public static void main(String[] args) {
        ThreadDaemoDemo t1 = new ThreadDaemoDemo();
        ThreadDaemoDemo t2 = new ThreadDaemoDemo();
        ThreadDaemoDemo t3 = new ThreadDaemoDemo();


        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.setName("张飞");
        t2.setName("关羽");

        Thread.currentThread().setName("刘备");

        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
