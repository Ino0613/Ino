package Project.FileStream;

import java.io.*;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ino\\Ino\\1.txt"));
//
//        for (int i = 0; i < 10; i++) {
//            bw.write("Hello" + i);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\1.txt"));


        String line;
        while ((line=br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
