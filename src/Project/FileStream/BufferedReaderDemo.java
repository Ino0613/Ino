package Project.FileStream;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ino\\Ino\\Test.txt"));

//        int bt;
//        while ((bt = br.read()) != -1) {
//            bw.write(bt);
//        }
//
//        bw.close();
//        br.close();
        char[] bt = new char[1024];
        int in ;
        while ((in = br.read(bt)) != -1) {
            bw.write(bt,0,in);
        }

        bw.close();
        br.close();

    }
}
