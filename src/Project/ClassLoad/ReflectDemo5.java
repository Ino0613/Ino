package Project.ClassLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.method1();
        s.method2("林青霞");
        String ss = s.method3("林青霞",30);
        System.out.println(ss);
        s.function();
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取类
        Class<?> c = Class.forName("Project.ClassLoad.Student");

        //Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        Method m1 = c.getMethod("method1");

        Method m2 = c.getMethod("method2", String.class);

        //s.method1();
        m1.invoke(o);
        //s.method2("林青霞");
        m2.invoke(o, "林青霞");

        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o1 = m3.invoke(o, "林青霞", 30);
        System.out.println(o1);

        //s.function()
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(o);
    }
}
