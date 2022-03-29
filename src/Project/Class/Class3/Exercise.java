package Project.Class.Class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Exercise {
    private ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
    //用于遍历实现，如hasNext方法等
    private int current = 0;
    private BinaryOperation generateOperation(){
        Random r = new Random();
        int opValue = r.nextInt(2);
        if (opValue == 1) {
            return new AdditionOperation();
        }
        return new SubstractOperation();
    }

    public void generateAdditionExercise(int operationCount) {
        BinaryOperation anOperation;
        while (operationCount > 0) {
            do {
                anOperation = new AdditionOperation();
            } while (operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }

    public void generateBinaryExercise(int operationCount) {
        BinaryOperation anOperaion;
        while (operationCount > 0) {
            do {
                anOperaion = generateOperation();
            } while (operationList.contains(anOperaion));
            operationList.add(anOperaion);
            operationCount--;
        }
    }

    public void generateSubstractExercise(int operationCount) {
        BinaryOperation anOperation;
        while (operationCount > 0) {
            do {
                anOperation = new SubstractOperation();
            } while (operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }

    public void add(BinaryOperation anOperation) {
        operationList.add(anOperation);
    }

    public boolean contains(BinaryOperation anOperation) {
        return operationList.contains(anOperation);
    }

    public int length(){
        return operationList.size();
    }

    //下面两个方法用于实现遍历数据
    public boolean hasNext(){ //若有元素返回true,否则返回false
        return current <= operationList.size() - 1;
    }

    public BinaryOperation next(){ //若有元素返回当前元素，移动到下一个
        return operationList.get(current++);
    }

    //方法2: 使用 ArrayList 自带的Iterator, 这像是一个适配器模式
    public Iterator<BinaryOperation> iterator() {
        return operationList.iterator();
    }

    public void printCurrent(){
        System.out.println("current = " + current);
    }


}

