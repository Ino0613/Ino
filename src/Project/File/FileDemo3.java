package Project.File;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
            public boolean isDirectory()  是否为目录
            public boolean isFile()  是否为文件
            public boolean exists()  是否存在

            public String getAbsolutePath() 返回该路径名的绝对路径名字符串
            public String getPath() 返回该路径名字符串
            public String getName() 返回该文件或目录的名称

            public String[] list() 返回该路径表示的目录中的文件和目录的名称字符串数组
            public File[] listFiles() 返回该路径名表示的目录中的文件和目录的File对象数组
         */
        File f1 = new File("D:\\Ino");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("=============");

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("=============");

        File f2 = new File("D:\\Ino");
        String[] strArr = f2.list();
        for (String st : strArr) {
            System.out.println(st);
        }
        File[] file1 = f2.listFiles();
        for (File f : file1) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}
