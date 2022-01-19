package co.yunmc.java;

/*
    1.数组相关的概念:
     - 数组名
     - 元素
     - 角标、下标、索引
     - 数组的长度，元素的个数

    2.数组的特点:
     - 有序排序
     - 数组属于引用数据类型的变量，数组的元素，既可以是基本数据类型，也可以是引用数据类型
     - 创建数组对象对象会在内存中开辟一整块连续的空间
     - 数组的长度一旦确定，就不能修改

    3.数组的分类:
     - 按照维数：一维数组、二维数组
     - 按照数组元素的类型，基本数据类型元素的数组、引用数据类型元素的数组

    4.数组的使用
     - 一维数组的生命和初始化
     - 如何调用数组的指定位置的元素
     - 如何获取数组的长度
     - 如何遍历数组
     - 数组元素的默认初始化值
     - 数组的内存解析
  */
public class ArrayTest {
     public static void main(String[] args) {
         //1.1 静态初始化: 数组的初始化和数组元素的复制操作同时进行
         int[] num = new int[]{1,2,3,4,5,6};
         System.out.println(num[0]);
         //1.2 动态初始化: 数组的初始化和数组元素的复制操作分开进行
         String[] name = new String[5];
         name[0] = "张三";
         System.out.println(name[0]);
         System.out.println(name.length);
         for(int i = 0; i<name.length; i++){
             System.out.println(name[i]);
         }
         int[] n = new int[5];
         for(int i = 0; i<n.length; i++){
             System.out.println(n[i]);
         }

         short[] m = new short[5];
         for(int i = 0; i<m.length; i++){
             System.out.println(m[i]);
         }

         boolean[] a = new boolean[5];
         for(int i = 0; i<a.length; i++){
             System.out.println(a[i]);
         }

         char[] c = new char[5];
         for(int i = 0; i<c.length; i++){
             System.out.println(c[i]);
         }
         int[] nub = new int[8];



     }
}
