package Project.Abstract;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说");
    }
}
