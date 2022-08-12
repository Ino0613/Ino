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
            System.out.println("�ɻ�");

        });
        useFlyable(a -> {
            System.out.println(a);
            System.out.println("�ɻ�");

        });
    }
    public static void useFlyable(Flyable f){
        f.fly("����������������");
    }
}
