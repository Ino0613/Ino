package Project;

public class A {
    public static void main(String[] args) {
        int[] a ={10,20,30,40};
        int[][] b = {{1,2},{4,5,6,7}};
        b[0] = a;
        b[0][1] = b[1][3];
        System.out.println(b[0][3]);
        System.out.println(a[1]);

//        long[] c= {1,2,3,4};
//        long[] d = {100,200,300,400,500};
//        d=c;
//        System.out.println(d.length);
//        System.out.println(d[0]);
    }
}
