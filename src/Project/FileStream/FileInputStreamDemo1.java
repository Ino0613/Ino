package Project.FileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Ino\\Test.txt");
        int by = fis.read();
        System.out.println(by);
    }
}
