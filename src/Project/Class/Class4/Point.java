package Project.Class.Class4;

public class Point {
    int x,y;

    Point(int a, int b) {
        x=a;
        y=b;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

interface Shape{
    public void draw();
}

class Line implements Shape {

    Point begin,end;

    Line(Point a, Point b) {
        begin = a;
        end = b;
    }

    @Override
    public void draw() {
        System.out.println("Draw a line from " + begin + " to " + end);
    }
}

class Square implements Shape{
    Point corner;
    int width,height;

    Square(Point s, int w, int h) {
        corner = s;
        width = w;
        height = h;
    }

    @Override
    public void draw() {
        System.out.println("Draw a square from " + corner +" to " + new Point(corner.getX() + width, corner.getY() + height));
    }
}

class Circle implements Shape {
    Point center;
    int r;

    Circle(Point c, int r) {
        center = c;
        this.r = r;
    }
    @Override
    public void draw() {
        System.out.println("Draw a circle at " + center +" with radius " + r);
    }
}
//创建一个工厂方法，根据创建的类，选择不同的draw
class DrawFactory{
    public Shape pen(Point a, Point b) {
        return new Line(a, b);
    }

    public Shape pen(Point start, int w, int h) {
        return new Square(start, w, h);
    }

    public Shape pen(Point center, int r) {
        return new Circle(center, r);
    }
}

class FactoryMethodTester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(20, 15);
        DrawFactory factory = new DrawFactory();
        factory.pen(p1,p2).draw();
        factory.pen(p1, 20, 15).draw();
        factory.pen(p1,10).draw();
    }
}
