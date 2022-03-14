package Project.Abstract;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉");
    }
}
