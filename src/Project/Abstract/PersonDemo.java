package Project.Abstract;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("张三");
        ppp.setAge(18);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.speak();
        ppp.study();
        ppp.study();
    }
}
