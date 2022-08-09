package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

public class Circle implements Shape {
        Point center;
        int r;

        public Circle(Point c, int r) {
            center = c;
            this.r = r;
        }
        @Override
        public void draw() {
            System.out.println("Draw a circle at " + center +" with radius " + r);

    }
}
