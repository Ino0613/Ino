package Project.FileStream;

import java.io.*;

/*
    InputStreamReader: 是从字节流到字符流的桥梁
        他读取字节，并使用指定的编码将其解码为字符
        塔使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

    OutputStreamReader: 是从字符流到字节流的桥梁
        使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter (OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter
        //OutputStreamWriter (OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Ino\\Ino\\1.txt"));
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Ino\\Ino\\1.txt"));
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
        isr.close();
    }
}
