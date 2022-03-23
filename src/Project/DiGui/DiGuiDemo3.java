package Project.DiGui;

import java.io.File;

public class DiGuiDemo3 {
    public static void main(String[] args) {
        File f1 = new File("D:\\Ino");
        getAllFilePath(f1);
    }
    //定义一个方法，用于获取给定目录下的所有内容，参数为第一步创建的File对象
    public static void getAllFilePath(File srcFiles) {
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] filesarr = srcFiles.listFiles();
        //遍历该File数组,得到每一个File对象
        if (filesarr != null) {
            for (File file : filesarr) {
                //判断File对象是否是目录
                if (file.isDirectory()) {
                    //是，递归调用
                    getAllFilePath(file);
                } else {
                    //不是,获取绝对路径输出在控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
