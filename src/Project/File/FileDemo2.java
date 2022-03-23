package Project.File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //需求1: 在某目录下创建一个文件java.txt
        File f1 = new File("D:\\Ino\\java.txt");
        System.out.println(f1.createNewFile());

        //需求2: 在某目录下创建一个目录
        File f2 = new File("D:\\Ino\\1");
        System.out.println(f2.mkdir());

        //需求3: 在某目录下创建多级目录
        File f3 = new File("D:\\Ino\\2\\1");
        System.out.println(f3.mkdirs());
    }

}
