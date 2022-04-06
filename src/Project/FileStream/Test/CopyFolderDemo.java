package Project.FileStream.Test;

import java.io.*;

/*
    需求:
        把E:\\Ino\\Test 这个文件夹复制到模块目录下
    思路：
        1.创建数据源目录File对象，路径是E:\\Ino\\Test
        2.获取数据源目录File对象的名称(Test)
        3.创建目的地目录File对象，路径名是模块名 + Test 组成 (Ino\\Test)
        4.判断目的地目录对应的FIle是否存在，如果不存在，则创建
        5.获取数据源目录下所有文件的File数组
        6.遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        7.获取数据源文件File对象的名称
        8.创建目的地文件File对象，路径名是目的地目录+ tp.jpg组成
        9.赋值文件
            由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws  IOException{
        //创建数据源目录File对象，路径是E:\\Ino\\Test
        File srcFolder = new File("E:\\Ino\\Test");
        //获取数据源目录File对象的名称(Test)
        String srcFolderName = srcFolder.getName();
        System.out.println(srcFolderName);
        //创建目的地目录File对象，路径名是模块名 + Test 组成 (Ino\\Test)
        File destFolder = new File("D:\\Ino\\Ino",srcFolderName);
        //判断目的地目录对应的FIle是否存在，如果不存在，则创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        //获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File f : listFiles) {
            //获取数据源文件File对象的名称
            String srcFileName = f.getName();
            //创建目的地文件File对象，路径名是目的地目录+ tp.jpg组成
            File destFile = new File(destFolder, srcFileName);
            copyFile1(f, destFile);
        }
    }

    private static void copyFile1(File f, File destFile) throws  IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}
