package Project.RunnableDemo;

public class MyRunnable {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("�߳�������");
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        }).start();
    }
}
