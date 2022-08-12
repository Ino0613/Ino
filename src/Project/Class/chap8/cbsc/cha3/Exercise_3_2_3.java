package Project.Class.chap8.cbsc.cha3;
/*
 * ��ƶ�
 * ����3����Exercise��ArayList���ṩnext��hasNext������ͻ�ʵ��formateAndDisplay
 */
// import cbsc.cha4.OperationBase;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Exercise_3_2_3 {
	private static final short COLUMN_NUMBER=5;
	private ArrayList<BinaryOperation_3_2> operationList = new ArrayList<BinaryOperation_3_2>();
	private int current=0; // only used for iterator
	
	private BinaryOperation_3_2 generateOperation(){
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1){ 
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	// 2020-03-20 ����ʹ�ã�ʹ���߱�����������ݽṹ
	public ArrayList<BinaryOperation_3_2> getOperations(){
		return operationList;
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
	//������ʽ�б����ڵ�8������������ʽ
	public void clear(){
		operationList.clear();
	}
	
	private static void print(String str){
		System.out.print(str);
	}
	public void formattedDisplay (int columns){
		int column=1;  
		int count = 1;
		for(BinaryOperation_3_2 op: operationList) {
			if (column > columns){
				print("\n");
				column = 1;
			}
			print(""+count+"."+"   ");
			print(op.asString()+"\t");
			count++;
			column++;
		} 
		print("\n");
	}
	// supplement: 2020-03-25
	
	public void formattedDisplayFull (int columns){
		int column=1;  
		int count = 1;
		for(BinaryOperation_3_2 op: operationList) {
			if (column > columns){
				print("\n");
				column = 1;
			}
			print(""+count+"."+"   ");
			print(op.fullString()+"\t");
			count++;
			column++;
		} 
		print("\n");
	}
	public void formattedDisplay(){
		formattedDisplay (COLUMN_NUMBER);
	}
	// 
	
	// ����������������ʵ�ֱ�������
	public boolean hasNext(){ 		// ����Ԫ�ط���true�����򷵻�false��
		return current <= operationList.size()-1;
	}
	public BinaryOperation_3_2 next(){		// ����Ԫ�ط��ص�ǰԪ�أ��ƶ���һ��
		return operationList.get(current++);
	}
	public void printCurrent(){
		System.out.println("current="+current);
	}
	//���ݵ�7�µ��������һ�ֻ�ȡԪ�صķ���
	public BinaryOperation_3_2 getOperation(int index){
		if(index < operationList.size()) return operationList.get(index);
		else return null;
	}
	// for test
	public void all(){
		for (BinaryOperation_3_2 op:operationList){
			System.out.println(op.asString());
		}
	}
	// for test
	public void writeResults(File aFile){
		try{
			Writer out = new FileWriter(aFile, true);
			for (BinaryOperation_3_2 op: operationList){
				out.write(op.getResult()+",");
			}
			out.flush();
			out.close();
		}
		catch(IOException e){
			System.out.println("ERROR: "+e);
		}		
	}
	// ��ʽ2��ʹ��ArrayList�Դ���Iterator,������һ��������ģʽ��
	public Iterator<BinaryOperation_3_2> iterator(){
		return operationList.iterator();
	}
	
}
