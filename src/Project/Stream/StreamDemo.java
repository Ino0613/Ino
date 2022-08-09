package Project.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    需求：按照下面的要求完成集合的创建和遍历
        1.创建一个集合，存储多个字符串元素
        2.把集合中所有以“张”开头的元素存储到一个新的集合
        3.把“张”开头的集合中的长度为3的元素存储到一个新的集合
        4.遍历上一步得到的集合

 */
public class StreamDemo {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张杰");
        list.add("张敏");
        list.add("张无忌");

        list1.add("linqingxia");
        list1.add("zhangzhaom");
        list1.add("wangzuxian");
        list1.add("liuyan");
        list1.add("zhangjie");
        list1.add("zhangmin");
        list1.add("zhangwuji");
        //把集合中所有以“张”开头的元素存储到一个新的集合
        ArrayList<String> zhanglist = new ArrayList<>();

        for (String s : list) {
            if (s.startsWith("张")) {
                zhanglist.add(s);
            }
        }
        System.out.println(zhanglist);

        ArrayList<String> zhanglist1 = new ArrayList<>();
        for (String s : zhanglist) {
            if (s.length() == 3) {
                zhanglist1.add(s);
            }
        }
        System.out.println(zhanglist1);
        System.out.println("===============");

        //使用Stream流来改进
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);

        //需求1：去前3个数据再控制台输出
        list.stream().limit(3).forEach(System.out::println);

        //需求2：跳过3个元素，把剩下的元素再控制台输出
        list.stream().skip(3).forEach(System.out::println);

        //需求3：跳过2个元素，把剩下的元素中前2个再控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("===============");
        //需求4：取前4个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);

        //需求5：跳过2个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);

        //需求6：合并需求4和需求5得到的流，并把结果输出控制台中
        //Stream.concat(s1, s2).forEach(System.out::println);;


        //需求7：需求6，要求字符串元素不能重复
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
        System.out.println("===============");

        //需求8：利用sorted()，按照自然顺序排序
        //list1.stream().sorted().forEach(System.out::println);

        //需求9：需求8，通过长度排序
        //list1.stream().sorted((s11,s22)-> s11.length()-s22.length()).forEach(System.out::println);
        list1.stream().sorted((s11,s22)->{
            int num = s11.length() - s22.length();
            int num2 = num==0 ? s11.compareTo(s22):num;
            return num2;
        }).forEach(System.out::println);
    }

}

