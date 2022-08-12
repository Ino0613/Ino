package Project.Class.chap8.cbsc.cha3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Exercise_3_2_4 {
	
	private ArrayList<BinaryOperation_3_2> operationList = new ArrayList<BinaryOperation_3_2>();
	private int current=0; // ����iterator����hasnext������
	
	private BinaryOperation_3_2 generateOperation(){
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1){ 
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	public void generateAdditionExercise( int operationCount){
		BinaryOperation_3_2 anOperation;
		while (operationCount > 0 ){
			do {anOperation = new AdditionOperation();
			}while (operationList.contains(anOperation));
			operationList.add(anOperation);
			operationCount--;
		}
	}
	public void generateBinaryExercise(int operationCount){
		BinaryOperation_3_2 anOperation;
		
		while (operationCount > 0 ){
			do{anOperation = generateOperation();
			}while (operationList.contains(anOperation));
			operationList.add(anOperation);
			operationCount--;
		}
	}
	public void generateSubstractExercise(int operationCount){
		BinaryOperation_3_2 anOperation;
		
		while (operationCount > 0 ){
			do{anOperation = new SubstractOperation();
			}while (operationList.contains(anOperation));
			operationList.add(anOperation);
			operationCount--;
		}
	}
	// --- 2015-8-4: begin
	public void add(BinaryOperation_3_2 anOperation){
		operationList.add(anOperation);
	}
	public boolean contains(BinaryOperation_3_2 anOperation){
		return operationList.contains(anOperation);
	}
	public int length(){
		return operationList.size();
	}
	
	// ---- 2015-8-4: ----- end 	
	// ����������������ʵ�ֱ�������
	public boolean hasNext(){ 		// ����Ԫ�ط���true�����򷵻�false��
		return current <= operationList.size()-1;
	}
	public BinaryOperation_3_2 next(){		// ����Ԫ�ط��ص�ǰԪ�أ��ƶ���һ��
		return operationList.get(current++);
	}
	// ��ʽ2��ʹ��ArrayList�Դ���Iterator,������һ��������ģʽ��
	public Iterator<BinaryOperation_3_2> iterator(){
		return operationList.iterator();
	}
		
	public void printCurrent(){
		System.out.println("current="+current);
	}
}

