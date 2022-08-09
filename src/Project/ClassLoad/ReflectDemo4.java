package Project.ClassLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    反射获取成员方法并使用
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Project.ClassLoad.Student");

        //Metohd[] getMethods() 返回一个包含 方法对象的数组,方法对象反映由该Class对象表示的类或接口的所有公共方法，
        //Method[] getDeclaredMethods() 返回一个包含 方法对象的数组 ↑ 的所有声明方法
        //Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("===================");

        Method name = c.getMethod("method1");
        Method method2 = c.getMethod("method2", String.class);

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        //在类或接口上提供有关单一方法的信息和访问权限
        name.invoke(o);
        method2.invoke(o, "特殊");
        System.out.println(name);
        System.out.println(method2);
    }
}
