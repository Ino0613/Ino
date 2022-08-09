package Project.Box;
/*
    生产者消费者案例中包含的类:
        1.奶箱类(Box): 定义一个成员变量，表示第x瓶奶，提供储存牛奶和获取牛奶的操作
        2.生产者类(Producer): 实现Runnable接口，重写run()方法，调用存储牛奶的操作
        3.消费者类(Customer): 实现Runnable接口，重写run()方法,调用获取牛奶的操作
        4.测试类(BoxDemo): 黎民祐main方法，代码步骤如下：
            a.创建奶箱对象，共享数据区域
            b.创建生产者对象，把奶箱对象作为构造方法参数传递，这个类中药调用存储牛奶的操作
            c.创建消费者对象把奶箱对象作为构造方法参数传递，这个类中药调用存储牛奶的操作
            d.创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
            e.启动线程
 */
public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象，共享数据区域
        Box b = new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，这个类中药调用存储牛奶的操作
        Producer p = new Producer(b);

        //创建消费者对象把奶箱对象作为构造方法参数传递，这个类中药调用存储牛奶的操作
        Customer c = new Customer(b);

        //创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();
    }
}
