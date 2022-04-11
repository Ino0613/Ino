package Project.MyThread;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadRunDemo t1 = new ThreadRunDemo();
        ThreadRunDemo t2 = new ThreadRunDemo();
        t1.setName("飞机");
        t2.setName("汽车");
        t1.start();
        t2.start();
    }
}
