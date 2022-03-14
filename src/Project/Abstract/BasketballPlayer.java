package Project.Abstract;

public class BasketballPlayer extends Player{

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }
}
