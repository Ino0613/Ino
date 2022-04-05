package Project.FileStream.Test;

public class Students {
    String name;
    int Math;
    int Chinese;
    int English;

    public Students() {
    }

    public Students(String name, int math, int chinese, int english) {
        this.name = name;
        Math = math;
        Chinese = chinese;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }
    public int getSum(){
        return this.Chinese + this.Math + this.English;
    }


}
