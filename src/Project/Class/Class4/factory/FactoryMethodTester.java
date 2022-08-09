package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

public class FactoryMethodTester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(20, 15);
        Point p3 = new Point(120, 225);
        DrawFactory factory = new DrawFactory();
        factory.pen(p1,p2).draw();
        factory.pen(p1, 20, 15).draw();
        factory.pen(p1,10).draw();
        factory.pen(p1, p2, p3).draw();
    }
}
