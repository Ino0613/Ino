/*ДњТы8.12*/
package Project.Class.chap8.ch8;

import Project.Class.chap8.cbsc.cha3.BinaryOperation_3_2;
import Project.Class.chap8.cbsc.cha3.Exercise_3_2_3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class code8_12{
  public static void main(String[] args) {
		Connection con = null;
		Statement stmt;
		int count=0;
		try {
			con=DBUtil.getConnection();
            stmt=con.createStatement();

      		con.setAutoCommit(false);
      		

    		Exercise_3_2_3 exercise = new Exercise_3_2_3();
    		ArrayList<BinaryOperation_3_2> opList;
    		String str_sql;
    		exercise.generateAdditionExercise(120);
    		opList=exercise.getOperations();
    		System.out.println("---- generate and display add exercises ----");
    		for(BinaryOperation_3_2 op: opList) {
    			count++;
    			str_sql="Insert into questions Values('"+count+"',"+"'"+op.getLeftOperand()+"','"+op.getOperator()+"','"+op.getRightOperand()+"','"+op.getResult()+"','1')";
    			stmt.addBatch(str_sql);
    		}
    		stmt.executeBatch();      		
      		con.commit();
      		con.close();
   	}
     	catch(Exception ex) {
			try{
				con.rollback();
        	}
        	catch(SQLException sqlex){
           	ex.printStackTrace();
        	}
     	}
  }
}
