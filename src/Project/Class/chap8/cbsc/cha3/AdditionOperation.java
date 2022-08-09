package Project.Class.chap8.cbsc.cha3;

 
public class AdditionOperation extends BinaryOperation_3_2 {
	public AdditionOperation() {
		
		generateBinaryOperation('+');		
	}
	public boolean checkingCalculation(int anInteger){
		return anInteger <= UPPER;
	}
	int calculate(int left, int right){
		try
		{
	        if (left>100 || right>100)
	            throw new Exception("数值无效");
		}
		catch(Exception e){
		     System.out.println(e.toString());
		}

		
		
		return left+right;
	}
	/*public static void main(String[] args) {
		
		AdditionOperation  add1 = new AdditionOperation();
		 System.out.println(add1.calculate(125, 6));
	}*/
}