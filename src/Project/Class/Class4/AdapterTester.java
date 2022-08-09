package Project.Class.Class4;

import java.util.ArrayList;

public class AdapterTester {
    public static void main(String[] args) {
        ArrayList<Printer> list = new ArrayList<Printer>();
        Printer pl = new Printer_L();
        list.add(pl);
        Printer ph = new AdapterH();
        list.add(ph);
        Printer pt = new AdapterT(new Printer_T());
        list.add(pt);
        Printer pp = new AdapterP(new Printer_P());
        list.add(pp);
        for (Printer printer : list) {
            printer.print();
        }
    }
}

interface Printer {
    void print();
}

class Printer_L implements Printer {
    public void print() {
        System.out.println("Type L printer is printing");
    }
}
//新引进的类1，不能改动
class Printer_H {
    public void display() {
        System.out.println("Type H printer is printing");
    }
}

//适配器类1
class AdapterH extends Printer_H implements Printer {
    public void print() {
        display();
    }
}

//新引用的类2，不能改动
class Printer_T {
    public void display() {
        System.out.println("Type T printer is printing");
    }
}

//适配器类2
class AdapterT implements Printer {
    private final Printer_T printer;

    public AdapterT(Printer_T printer) {
        this.printer = printer;
    }

    public void print() {
        printer.display();
    }
}
class Printer_P {
    public void display() {
        System.out.println("Type P printer is printing");
    }
}

//适配器类2
class AdapterP implements Printer {
    private final Printer_P printer;

    public AdapterP(Printer_P printer) {
        this.printer = printer;
    }

    public void print() {
        printer.display();
    }
}


