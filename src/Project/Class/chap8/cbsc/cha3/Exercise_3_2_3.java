package Project.Class.chap8.cbsc.cha3;
/*
 * 设计二
 * 方案3：让Exercise含ArayList，提供next和hasNext，让其客户实现formateAndDisplay
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
	// 2020-03-20 谨慎使用，使用者必须理解其数据结构
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
	//重置算式列表，用于第8章重新生成算式
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
	
	// 下面两个方法用于实现遍历数据
	public boolean hasNext(){ 		// 若有元素返回true，否则返回false，
		return current <= operationList.size()-1;
	}
	public BinaryOperation_3_2 next(){		// 若有元素返回当前元素，移动到一个
		return operationList.get(current++);
	}
	public void printCurrent(){
		System.out.println("current="+current);
	}
	//根据第7章的需求添加一种获取元素的方法
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
	// 方式2：使用ArrayList自带的Iterator,这像是一个适配器模式！
	public Iterator<BinaryOperation_3_2> iterator(){
		return operationList.iterator();
	}
	
}
