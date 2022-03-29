package Project.Class.Class3;

public class SubstractOperation extends BinaryOperation {
    public SubstractOperation() {
        generateBinaryOperation('-');
    }

    boolean checkingCalulation(int aI) {
        return aI >= LOWER;
    }

    int calculate(int left, int right) {
        return left - right;
    }

}
