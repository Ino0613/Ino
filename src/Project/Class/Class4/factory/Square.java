package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

public class Square implements Shape{
        Point corner;
        int width,height;

        public Square(Point s, int w, int h) {
            corner = s;
            width = w;
            height = h;
        }

        @Override
        public void draw() {
            System.out.println("Draw a square from " + corner +" to " + new Point(corner.getX() + width, corner.getY() + height));

    }
}
