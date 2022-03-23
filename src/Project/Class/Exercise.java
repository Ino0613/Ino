package Project.Class;

public class Exercise {
    private static final short OPERATION_NUMBER = 50;
    private static final short COLUMN_NUMBER = 5;
    BinaryOperation anOperation,opCreator = new BinaryOperation();
    private BinaryOperation operationList[] = new BinaryOperation[OPERATION_NUMBER];

    private static void print (String str){
        System.out.print(str);
    }

    public static void main(String[] args) {
        Exercise ec = new Exercise();
        System.out.println("屏幕显示50道加法运算题：");
        ec.generateAdditionExercise();
        ec.formateAndDisplay();

        System.out.println("屏幕显示50道减法运算题:");
        ec.generateSubstractExercise();
        ec.formateAndDisplay();

        ec.generateBinaryExercise();
        System.out.println("屏幕显示50道加法或减法运算题:");
        ec.formateAndDisplay();
    }

    //只要产生的算式没在当前练习题中，就加入尾部
    private boolean contains(BinaryOperation anOperation, int length) {
        boolean found = false;
        for (int i = 0; i <= length; i++) {
            if (anOperation.equals(operationList[i])) {
                found = true;
                break;
            }
        }
        return found;
    }

    //在数组中增加算术运算题前先检查是否已经在数组中，以避免重复
    public void generateBinaryExercise(){
        for (int i = 0; i < OPERATION_NUMBER; i++) {
            anOperation = opCreator.generateBinaryOperation();
            while (contains(anOperation, i - 1)) {
                anOperation = opCreator.generateBinaryOperation();
            }
            operationList[i] = anOperation;
        }
    }

    public void generateAdditionExercise(){
        for (int i = 0; i < OPERATION_NUMBER; i++) {
            anOperation = opCreator.generateAdditionOperation();
            while (contains(anOperation, i - 1)) {
                anOperation = opCreator.generateAdditionOperation();
            }
            operationList[i] = anOperation;
        }
    }

    public void generateSubstractExercise(){
        for (int i = 0; i < OPERATION_NUMBER; i++) {
            anOperation = opCreator.generateSubstractOperation();
            while (contains(anOperation, i - 1)) {
                anOperation = opCreator.generateSubstractOperation();
            }
            operationList[i] = anOperation;
        }
    }

    void formateAndDisplay(){
        int count = 1;
        for (int i = 0; i < OPERATION_NUMBER; i++) {
            if (count > COLUMN_NUMBER) {
                print("\n");
                count = 1;
            }
            print("" + (i + 1) + "." + "  ");
            print(operationList[i].asString() + "\t");
            count++;
        }
        print("\n");
    }

    void printAll(int count) {
        for (int i = 0; i < count; i++) {
            print(operationList[i].fullString());
            print(",");
        }
        System.out.println();
    }

    void printAll() {
        for (int i = 0; i < OPERATION_NUMBER; i++) {
            print(operationList[i].asString());
            print(",");
        }
        System.out.println();
    }
}
