package co.yunmc.Shixun1.Two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/co/yunmc/Shixun1/Two/a.txt");
            InputStreamReader isr = new InputStreamReader(fis);

            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/co/yunmc/Shixun1/Two/a.txt"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
