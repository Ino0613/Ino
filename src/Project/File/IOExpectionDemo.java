package Project.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExpectionDemo {
    public static void main(String[] args) throws IOException {

    }
    //方法四 JDK9
//    private static void method4() throws IOException{
//        FileReader fr = new FileReader("D:\\Ino\\Ino\\1.txt");
//        FileWriter fw = new FileWriter("D:\\Ino\\INo\\2.txt");
//        try (fr;fw){
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read(chs)) != -1) {
//                fw.write(chs, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//    //方法三 JDK7
//    private static void method3() {
//        try (FileReader fr = new FileReader("D:\\Ino\\Ino\\1.txt");
//             FileWriter fw = new FileWriter("D:\\Ino\\INo\\2.txt")){
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read(chs)) != -1) {
//                fw.write(chs, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//    //方法二
//    private static void method2() {
//        FileWriter fw = null;
//        FileReader fr = null;
//        try {
//            fr = new FileReader("D:\\Ino\\Ino\\1.txt");
//            fw = new FileWriter("D:\\Ino\\INo\\2.txt");
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read(chs)) != -1) {
//                fw.write(chs, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fw != null) {
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fr != null) {
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//        }
//
//    }
//    //直接抛出异常
//    private static void method1() throws IOException {
//        FileReader fr = new FileReader("D:\\Ino\\Ino\\1.txt");
//        FileWriter fw = new FileWriter("D:\\Ino\\INo\\2.txt");
//        char[] chs = new char[1024];
//        int len;
//        while ((len = fr.read(chs)) != -1) {
//            fw.write(chs, 0, len);
//        }
//        fw.close();
//        fr.close();
//    }
}
