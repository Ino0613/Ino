package Project.ClassLoad;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    练习1：有一个ArrayList<Integer> 集合，中如何在这个集合中添加一个字符串数据
 */
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //创建集合
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Class<? extends ArrayList> ac = arr.getClass();
        Constructor<? extends ArrayList> dc = ac.getDeclaredConstructor();

        Method add = ac.getMethod("add", Object.class);
        add.invoke(arr, "hello");
        add.invoke(arr, "world");
        add.invoke(arr, 10);
        System.out.println(arr);
    }
}
