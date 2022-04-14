package Project.Class.Test;

//class A {
//
//    double f(int x,double y) {
//
//        return x+y;
//
//    }
//
//    int f(int x,int y) {
//
//        return x*y;
//
//    }
//
//}
//
//public class Test1 {
//
//    public static void main(String args[]) {
//
//        A a=new A();
//
//        System.out.println(a.f(10,10)); //【代码1】
//
//        System.out.println(a.f(10,10.0)); //【代码2】
//
//    }
//
//}
class B {

    int n;

    static int sum=0;

    void setN(int n) {

        this.n=n;

    }

    int getSum() {

        for(int i=1;i<=n;i++)

            sum=sum+i;

        return sum;

    }

}

public class Test1{

    public static void main(String args[]) {

        B b1=new B(),b2=new B();

        b1.setN(3);

        b2.setN(5);

        int s1=b1.getSum();

        int s2=b2.getSum();

        System.out.println(s1+s2);

    }

}