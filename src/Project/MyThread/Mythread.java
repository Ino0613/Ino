package Project.MyThread;

public class Mythread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i + getName());
        }
    }
}
