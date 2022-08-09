package Project.MyMethodReference.Test2;

public class PrinterDemo {
    public static void main(String[] args) {
        usePrinter(s -> System.out.println(s.toUpperCase()));
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);
        usePrinter(new PrintString()::printUpper);
    }
    private static void usePrinter(Printer p){
        p.printUpperCase("ASsdf");

    }
}
