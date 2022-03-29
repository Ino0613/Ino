package Project.Class.Class3;

public class AdditionOperation extends BinaryOperation {
    public AdditionOperation() {
        generateBinaryOperation('+');
    }

    @Override
    boolean checkingCalulation(int aI) {
        return aI <= UPPER;
    }

    @Override
    int calculate(int left, int right) {
        return left + right;
    }
}

