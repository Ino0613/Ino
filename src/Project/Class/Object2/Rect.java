package Project.Class.Object2;

public class Rect {
    public int length;
    public int width;

    public Rect() {
    }
    public Rect(int length,int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return length * width;
    }
    public int getCycle(){
        return (length + width) * 2;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
