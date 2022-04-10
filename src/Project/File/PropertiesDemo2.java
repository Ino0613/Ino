package Project.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
//        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties ppt = new Properties();
        FileReader fr = new FileReader("D:\\Ino\\Ino\\fw.txt");
        ppt.load(fr);
        fr.close();
        System.out.println(ppt);

    }

    private static void myStore() throws IOException {
        Properties ppt = new Properties();
        ppt.setProperty("2020210111", "张三");
        ppt.setProperty("2020210112", "李四");

        FileWriter fw = new FileWriter("D:\\Ino\\Ino\\fw.txt");
        ppt.store(fw, null);
        fw.close();
    }
}
