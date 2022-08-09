package Project.ClassLoad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    练习2：通过配置文件运行类中的方法
 */
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\Ino\\Ino\\2.txt");
        prop.load(fr);
        fr.close();

        String classname = prop.getProperty("classname");
        String method = prop.getProperty("method");

        Class<?> c = Class.forName(classname);
        Object o = c.newInstance();
        Method m = c.getMethod(method);
        m.invoke(o);

    }
}
