package Project.MyInterface.Test3;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable((String s) -> {
            System.out.println(s);
        });
        usePrintable(s ->System.out.println(s));
        //方法引用符 :   ::
        usePrintable(System.out::println);
    }

    public static void usePrintable(Printable p) {
        p.printString("爱生活");

    }
}
