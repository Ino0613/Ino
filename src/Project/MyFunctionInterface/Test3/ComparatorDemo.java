package Project.MyFunctionInterface.Test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("aaaa");
        arr.add("bb");
        arr.add("c");
        System.out.println("排序前：" +arr );
        //Collections.sort(arr);
        Collections.sort(arr,getCompartor());
        System.out.println("排序后：" + arr);

    }

    private static Comparator<String> getCompartor() {
        //匿名内部类的实现
//        Comparator<String> cop = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//        return cop;

//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
        return (s1,s2) -> s1.length() - s2.length();

    }
}
