package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

public class DrawFactory {

    //创建一个工厂方法，根据创建的类，选择不同的draw
        public Shape pen(Point a, Point b) {
            return new Line(a, b);
        }

        public Shape pen(Point start, int w, int h) {
            return new Square(start, w, h);
        }

        public Shape pen(Point center, int r) {
            return new Circle(center, r);
        }

    public Shape pen(Point x, Point y, Point z) {
        return new TriangleGui(x, y, z);
    }
}

