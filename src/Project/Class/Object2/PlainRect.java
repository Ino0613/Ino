package Project.Class.Object2;

public class PlainRect extends Rect {
    public int startX;
    public int startY;


    public PlainRect() {
        this.startX = 0;
        this.startY = 0;

    }

    public PlainRect(int startX, int startY, int length, int width) {
        super(length, width);
        this.startX = startX;
        this.startY = startY;
    }

    public boolean isInside(double x,double y){
        return x > startX && x < startX + length || y > startY && y < startY + width;
    }

}
