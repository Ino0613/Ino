package Project.RunnableDemo.Test3;

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int x,int y) ->{
            return x + y;
        });
    }

    public static void useAddable(Addable a) {
        int sum = a.add(5, 6);
        System.out.println(sum);
    }
}
