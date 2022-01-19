package co.yunmc.Shixun1.One;



import java.io.*;

public class ObjectOS {

    public static void main(String[] args) {
        //1.定义流
        InputStream in = null;
        OutputStream out = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        //2.创建流
        File file = new File("src/co/yunmc/shixun/a.txt");
        try {
            in = new FileInputStream(file);
            out = new FileOutputStream("src/co/yunmc/shixun/b.txt");
            oos = new ObjectOutputStream(out);
            ois = new ObjectInputStream(new FileInputStream("src/co/yunmc/shixun/b.txt"));
            Students s = new Students(1,"张三",20);
            oos.writeObject(s);
            Object ois1 = ois.readObject();
            System.out.println(ois1);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
