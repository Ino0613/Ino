package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

public class Triangle implements Shape {

    Point x1,y1, z1;

    public Triangle(Point x, Point y, Point z) {
        x1 = x;
        y1 = y;
        z1 = z;
    }
    @Override
    public void draw() {
        System.out.println("Draw a Triangle at" + x1 + y1 + z1);
    }
}
