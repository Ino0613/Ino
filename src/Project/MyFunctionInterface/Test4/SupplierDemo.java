package Project.MyFunctionInterface.Test4;

import java.util.function.Supplier;

/*
    Supperlier<T>: 包含一个无参的方法
        T get(), 获得结果
        该方法不需要，他会按照某种实现逻辑（由Lambda表达式实现）返回一个数据
        Supplier<T> 接口也被称为生产型接口，如果我们制订了接口的泛型是什么类型，那么接口中的get方法就会产生什么类型的数据

 */
public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> {
            return "林青霞";
        });
        String s1 = getString(() -> "张琳杰");
        System.out.println(s);
        System.out.println(s1);
        Integer anInt = getInt(() -> 100);
        System.out.println(anInt);
    }
    //定义一个方法，返回一个字符串数据
    private static Integer getInt(Supplier<Integer> su){
        return su.get();
    }

    //定义一个方法，返回一个字符串数据
    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }
}
