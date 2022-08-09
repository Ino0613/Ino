package Project.Class.Class4.factory;

import Project.Class.Class4.Point;

import javax.swing.*;
import java.awt.*;

public class TriangleGui extends JFrame implements Shape {

    Point x1,y1, z1;

    public TriangleGui(Point x, Point y, Point z) {
        x1 = x;
        y1 = y;
        z1 = z;
    }
    class ShapesPanel extends JPanel{
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            Polygon filledPolygon = new Polygon();
            filledPolygon.addPoint(x1.getX(), x1.getY());
            filledPolygon.addPoint(y1.getX(), y1.getY());
            filledPolygon.addPoint(z1.getX(), z1.getY());
            g.drawPolygon(filledPolygon);
            g.drawLine(x1.getX(), x1.getY(), y1.getX(), y1.getY());
        }
    }

    public void draw() {
        this.getContentPane().add(new ShapesPanel());
    }
}
