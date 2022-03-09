package co.yunmc.java.container;


import java.util.ArrayList;

public class                TestArrayList2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        ArrayList<Integer> lore = new ArrayList<>();
        lore.add(3);
        list.forEach(System.out::println);
    }
}
