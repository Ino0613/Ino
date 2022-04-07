package Project.FileStream;

import java.io.*;

public class CopyJavaDemo1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\Test.java"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ino\\Ino\\Test2.java"));

//        String line;
//        while ((line = br.readLine()) != null) {
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
//        br.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\Test.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\Ino\\Ino\\Test2.java"),true);
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        pw.close();
        br.close();

    }
}
