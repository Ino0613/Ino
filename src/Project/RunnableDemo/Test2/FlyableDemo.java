package Project.RunnableDemo.Test2;

public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });
        useFlyable((String a) -> {
            System.out.println(a);
            System.out.println("飞机");

        });
        useFlyable(a -> {
            System.out.println(a);
            System.out.println("飞机");

        });
    }
    public static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
}
