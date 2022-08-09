package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

public class Line implements Shape {

        Point begin,end;

        public Line(Point a, Point b) {
            begin = a;
            end = b;
        }

        @Override
        public void draw() {
            System.out.println("Draw a line from " + begin + " to " + end);
        }

}
