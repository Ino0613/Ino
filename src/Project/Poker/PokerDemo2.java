package Project.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo2 {
    static HashMap<Integer,String> hm = new HashMap<Integer,String>();
    public static void main(String[] args) {
        //创建HashMap,键是编号，值是牌
//        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        //创建ArrayList存储编号
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //创建花色数组和点数数组
        String[] colors = {"♦","♣","♠","♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //从0开始往HashMap中存储编号,并存储对应的牌，同时往ArrayList里面存储编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                arr.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        arr.add(index);
        index++;
        hm.put(index, "大王");
        arr.add(index);

        //洗牌(洗的是编号),用Collections的shuffle()方法实现
        Collections.shuffle(arr);
        //发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接受)
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        TreeSet<Integer> ts3 = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            int poker = arr.get(i);
            if (i >= arr.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                ts1.add(poker);
            } else if (i % 3 == 1) {
                ts2.add(poker);
            } else if (i % 3 ==2 ){
                ts3.add(poker);
            }
        }
        LookPoker("A", ts1);
        LookPoker("B", ts2);
        LookPoker("C", ts3);
        LookPoker("底牌", dp);

//        LookPoker("A", ts1,hm);
//        LookPoker("B", ts2,hm);
//        LookPoker("C", ts3,hm);
//        LookPoker("底牌", dp,hm);

    }
    public static void LookPoker(String name,TreeSet<Integer> ts){
//        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        System.out.print(name + "的牌是:");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
