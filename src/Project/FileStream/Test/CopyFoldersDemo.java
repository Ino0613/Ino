package Project.FileStream.Test;
/*
    需求：
        把"E:\\Ino\\Test" 复制到 D盘中
    思路：
        1.创建数据源File对象，路径是E:\\Ino\\Test
        2.创建目的地File对象，路径是D:\\Ino\\Ino\\Test
        3.写方法实现文件夹的赋值，参数为数据源File对象和目的地File对象
        4.判断数据源File是否是目录
            是：
                A.在目的地下创建和数据源File名称一样的目录
                B.获取数据源File下所有文件或者目录的File数组
                C.遍历该File数组，得到每一个File对象
                D.把该File作为数据源File对象，递归调用赋值文件夹的方法
            不是：
                说明是文件，直接复制，用字节流
 */

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源File对象，路径是E:\\Ino\\Test
        File srcFile = new File("E:\\Ino\\Test");
        //创建目的地File对象，路径是D:\\Ino\\Ino\\Test
        File destFile = new File("D:\\Ino\\Ino");

        //写方法实现文件夹的赋值，参数为数据源File对象和目的地File对象
        copyFolder(srcFile, destFile);
    }

    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException{
        //判断数据源File是否是目录
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }

            //获取数据源File下所有文件或者目录的File数组
            File[] listfiles = srcFile.listFiles();

            //遍历该File数组
            for (File f : listfiles) {
                //把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(f,newFolder);
            }
        }else{
            //说明是文件，直接复制，用字节流
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile,newFile);
        }

    }

    //字节缓冲流复制文件
    private static void copyFile(File srcFile,File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
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
