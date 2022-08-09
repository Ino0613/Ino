package Project.Class.chap8.cbsc.cha3;

public class BinaryOperationTester3_1 {

	public static void main(String[] args) {
		// 设计一：有一个子类
		BinaryOperation_3_1 biop = new BinaryOperation_3_1();
        
        System.out.println("\n test1:constructor('+') with String:");   
        for (int i=0; i<10; i++){
        	System.out.println(""+i+": "+(biop.generateAdditionOperation()).asString());
        }
        System.out.println("\n test2:constructor('-') with full string:");   
        for (int i=0; i<10; i++){
        	System.out.println(""+i+": "+(biop.generateSubstractOperation()).fullString());
        }
        }
}