package Project.Abstract;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃白菜");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
