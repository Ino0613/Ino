package Project.ClassLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.name = "林青霞";
        s.age = 30;
        s.address = "西安“;
        System.out.println(s);
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("Project.ClassLoad.Student");

        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"林青霞");
        System.out.println(o);

        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o, 30);
        System.out.println(o);

        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        address.set(o, "西安");
        System.out.println(o);
    }
}
