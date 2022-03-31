package Project.FileStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\Ino\\Ino\\Test.java");
        FileWriter fw = new FileWriter("D:\\Ino\\Ino\\Test1.java");

//        int by;
//        while ((by = fr.read()) != -1) {
//            fw.write(by);
//        }
//        fw.close();
//        fr.close();
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
        fw.close();
        fr.close();
    }
}
