package Project.MyThread.Test;

public class SellTicket implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        //A.判断票数大于0，就卖票，并告知是哪个窗口
        //            B.卖了票之后，总票数要减
        //            C.票没有了，也可能有人来问，所以这里用死循环让卖票动作一直执行
        while (true){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": 正在售出第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
