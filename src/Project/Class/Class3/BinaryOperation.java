package Project.Class.Class3;

import java.util.Random;

public abstract class BinaryOperation {
    static final int UPPER = 100;
    static final int LOWER = 0;
    private int left_operand = 0, right_operand = 0;
    private char operator = '+';
    private int value = 0;

    protected void generateBinaryOperation(char aO) {
        int left, right, result;
        Random r = new Random();
        left = r.nextInt(UPPER + 1);
        do {
            right = r.nextInt(UPPER + 1);
            result = calculate(left, right);
        } while (!(checkingCalulation(result)));
        left_operand = left;
        right_operand = right;
        operator = aO;
        value = result;
    }


    public String toString() {
        return "" + left_operand +
                 operator +
                right_operand;
    }

    public String asString(){
        return toString() + "=";
    }

    abstract boolean checkingCalulation(int aI) ;

    abstract int calculate(int left, int right) ;
}
