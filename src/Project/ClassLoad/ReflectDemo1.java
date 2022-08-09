package Project.ClassLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    Constructor<?>[] getConstructors(): 返回所有公共构造方法对象的数组
    Constructor<?>[] getDeclaredConstructors(): 返回所有构造方法对象的数组
    Constructor<?> getConstructor(Class<?>...parameterTypes): 返回单个公共构造方法对象
    Constructor<?> getDeclaredConstructor(Class<?>... parameterTypes): 返回单个构造方法对象
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c1 = Class.forName("Project.ClassLoad.Student");

        Constructor<?>[] cons = c1.getConstructors();
        Constructor<?> dc1 = c1.getDeclaredConstructor();

        Constructor<?> constructor = c1.getConstructor(String.class, int.class, String.class);
        Object o = constructor.newInstance("林青霞", 30, "西安");
        System.out.println(o);

        Constructor<?> dc2 = c1.getDeclaredConstructor(String.class);

        //暴力反射
        //public void setAccessible(boolean flag) : 值为true,取消访问检查
        dc2.setAccessible(true);
        Object o1 = dc2.newInstance("林青霞");

        System.out.println(o1);
    }
}
