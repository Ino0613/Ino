package Project.Poker;


import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，定义一个集合对象，用ArrayList集合实现
        ArrayList<String> a = new java.util.ArrayList<String>();

        //往牌盒里装牌
        /*
            ♦  ♣  ♠  ♥
         */
        //定义花色数组
        String[] colors = {"♦","♣","♠","♥"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                a.add(color + number);
            }
        }
        a.add("大王");
        a.add("小王");

        //洗牌，用Collections的shuffle()方法实现
        Collections.shuffle(a);
//        System.out.println(a);

        //发牌
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            String poker = a.get(i);
            if (i >= a.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                a1.add(poker);
            } else if (i % 3 == 1) {
                a2.add(poker);
            } else {
                a3.add(poker);
            }
        }
        LookPoker("1",a1);
        LookPoker("2", a2);
        LookPoker("3", a3);
        LookPoker("底牌",dp);
    }

    public static void LookPoker(String name, ArrayList<String> arr) {
        System.out.print(name + "的牌是:");
        for (String poker : arr) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
