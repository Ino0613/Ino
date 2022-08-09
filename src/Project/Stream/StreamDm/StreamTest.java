package Project.Stream.StreamDm;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    现在有两个ArrayList集合,分别存储6名男演员名称和6名女演员名称. 要求完成如下的操作:
        1.男演员只要名字为3个字的前三人
        2.女演员只要姓林的，且不要第一个
        3.把过滤后的男演员和女演员名字合并到一起
        4.把上一步操作后的元素作为狗杂总方法的参数创建演员对象,遍历数据
            演员类Actor已经提供,里面有一个成员变量，一个带参构造方法。以及成员变量队医你个的get/set方法
 */
public class StreamTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manlist = new ArrayList<String>();
        manlist.add("周润发");
        manlist.add("成龙");
        manlist.add("刘德华");
        manlist.add("吴京");
        manlist.add("周星驰");
        manlist.add("李连杰");

        ArrayList<String> womanlist = new ArrayList<String>();
        womanlist.add("林心如");
        womanlist.add("张曼玉");
        womanlist.add("林青霞");
        womanlist.add("柳岩");
        womanlist.add("林志玲");
        womanlist.add("王祖贤");

        Stream<String> manlimit = manlist.stream().filter(s -> s.length() == 3).limit(3);
        //女演员只要姓林的，且不要第一个
        Stream<String> womanlimit = womanlist.stream().filter(s -> s.startsWith("林")).skip(1);
        //把过滤后的男演员和女演员名字合并到一起
        Stream<String> stream = Stream.concat(manlimit, womanlimit);
        //把上一步操作后的元素作为狗杂总方法的参数创建演员对象,遍历数据
        stream.map(Actor::new).forEach(p -> System.out.println(p.getName()));
    }
}
