package Project.MyInterface.Test2;

public interface Inter {
    default void show1(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("show1结束");
    }

    default void show2(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("show2结束");
    }
    static void method1(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("method1结束");
    }

    static void method2(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("method2结束");
    }

}
