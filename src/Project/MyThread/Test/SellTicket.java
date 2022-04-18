package Project.MyThread.Test;

public class SellTicket implements Runnable{
    private static int ticket = 100;
    private Object o = new Object();
    private int x = 0;

    @Override
    public void run() {
        //A.判断票数大于0，就卖票，并告知是哪个窗口
        //            B.卖了票之后，总票数要减
        //            C.票没有了，也可能有人来问，所以这里用死循环让卖票动作一直执行

            while (true){
                if (x % 2 == 0){
                    synchronized (this) {
                        if (ticket > 0) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread().getName() + ": 正在售出第" + ticket + "张票");
                            ticket--;
                        }
                    }
                }else {
                    sellTicket();
                }
                x--;
                x++;
        }

    }

    private static void sellTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 正在售出第" + ticket + "张票");
            ticket--;
        }
    }
}
