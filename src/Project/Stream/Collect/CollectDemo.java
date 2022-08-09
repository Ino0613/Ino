package Project.Stream.Collect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Stream流的收集方法
        R collect (Collector collector)
    它是通过工具类Collectors提供了具体的收集方法
        public static <T> Collector ToList ()：把元素收集到List集合中
        public static <T> Collector toSet(): 把元素收集到Set集合中
        public static Collector toMap(Function keyMapper,Function valueMapper): 把元素收集到Map集合中
 */
public class CollectDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        //需求1：得到名字为3个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);
        //listStream.forEach(System.out::println);

        //需求2：把使用Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for (String n : names) {
            System.out.println(n);
        }

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //需求3：得到年龄大于25的流
        Stream<Integer> integerStream = set.stream().filter(s -> s > 25);

        //需求4：把使用Stream流操作完毕的数据收集到Set集合中并遍历
        Set<Integer> collect = integerStream.collect(Collectors.toSet());
        for (Integer i : collect) {
            System.out.println(i);
        }

        //定义一个字符串数组，每一个字符串数据由姓名数据喝年龄数据组合而成
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};

        //需求5：得到字符串中年龄数据大于28的流
        Stream<String> stringStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

        //需求6：把使用Stream流操作完毕的数据收集到Map集合中并遍历，字符串中的姓名作键，年龄作值
        Map<String, Integer> collect1 = stringStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> keySet = collect1.keySet();
        for (String s : keySet) {
            Integer i = collect1.get(s);
            System.out.println(s + "," + i);
        }
    }
}
