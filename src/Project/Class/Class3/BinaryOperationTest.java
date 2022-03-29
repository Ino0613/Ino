package Project.Class.Class3;

public class BinaryOperationTest {
    public static void main(String[] args) {
        BinaryOperation bo;
        System.out.println("test1:constructor('+')");
        for (int i = 0; i < 10; i++) {
            bo = new AdditionOperation();
            System.out.println(bo);
        }
        System.out.println("test1:constructor('-')");
        for (int i = 0; i < 10; i++) {
            bo = new SubstractOperation();
            System.out.println(bo);
        }
    }
}
