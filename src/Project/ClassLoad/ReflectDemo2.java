package Project.ClassLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取成员变量并使用
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取对象
        Class<?> c = Class.forName("Project.ClassLoad.Student");

        //Field[] getFields()：返回一个包含Field对象的数组，Field对象反映由该Class对象表示的类或接口的所有可访问的公共
        //Field[] getDeclaredFields()：返回一个Field对象的数组，反映了由该Class对象表示的类或接口声明的所有字段
        Field[] fields = c.getFields();
        Field[] declaredFields = c.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }

        //Field[] getField()：返回一个包含Field对象，Field对象反映由该Class对象表示的类或接口的指定公共成员字段
        //Field[] getDeclaredField()：返回一个Field对象，反映了由该Class对象表示的类或接口的指定声明字段
        Field address = c.getField("address");
        System.out.println(address);

        //获取无参构造方法创建对象
        Field age = c.getDeclaredField("age");
        System.out.println(age);
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        address.set(o, "山西");
        System.out.println(o);
    }

}
