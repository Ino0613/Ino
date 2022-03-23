package Project.Class;

import java.util.Random;

public class BinaryOperation {
    static final int UPPER = 100;
    static final int LOWER = 0;
    int left,right,result;
    private int left_operand = 0,right_operand = 0;
    private char operator = '+';
    private int value = 0;

    public static void main(String[] args) {
        BinaryOperation bo = new BinaryOperation();
        int a = bo.construct(1,3,'+');
        System.out.println(a);
    }

    private int construct(int left, int right, char op) {
        left_operand = left;
        right_operand = right;
        operator = op;
        if (op == '+') {
            value = left + right;
        }else{
            value = left - right;
        }
        return value;
    }

    public BinaryOperation generateAdditionOperation(){
        Random r = new Random();
        BinaryOperation bop = new BinaryOperation();
        left = r.nextInt(UPPER+1);
        do {
            right = r.nextInt(UPPER + 1);
            result = right + left;
        } while (result > UPPER);
        bop.construct(left, right, '+');
        return bop;
    }

    public BinaryOperation generateSubstractOperation(){
        Random r = new Random();
        BinaryOperation bop = new BinaryOperation();
        left = r.nextInt(UPPER + 1);
        do {
            right = r.nextInt(UPPER + 1);
            result = left - right;
        } while (result < LOWER);
        bop.construct(left, right, '-');
        return bop;
    }

    //实例变量访问器

    public BinaryOperation generateBinaryOperation(){
        Random r = new Random();
        int opValue = r.nextInt(2);
        if (opValue == 1) {
            return generateAdditionOperation();
        }else
            return generateSubstractOperation();
    }

    public int getLeft_operand() {
        return left_operand;
    }

    public int getRight_operand() {
        return right_operand;
    }

    public char getOperator() {
        return operator;
    }

    public int getValue() {
        return value;
    }
    //示例

    public boolean equals(BinaryOperation b){
        return left_operand == b.getLeft_operand() &
                right_operand == b.getRight_operand() &
                operator == b.getOperator();
    }

    @Override
    // "32+5"
    public String toString() {
        return "" +
                left_operand +
                 getOperator() +
                  right_operand;
    }

    // "32+5="
    public String asString() {
        return toString() + "=";
    }

    // "32+5=37"
    public String fullString(){
        return toString() + "=" + getValue();
    }
}
