package Project.Class.Class3.ParameterizedCalculatorTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParameterizedCalculatorTest {

    private double expected; 
    private double valueOne; 
    private double valueTwo; 

    public ParameterizedCalculatorTest(double expected, 
    	       double valueOne, double valueTwo) {
    	       this.expected = expected;
    	       this.valueOne = valueOne;
    	       this.valueTwo = valueTwo;
    	    }
    @Parameters 
    public static Collection<Integer[]> getTestParameters() {
       return Arrays.asList(new Integer[][] {
          {3, 2, 1},  //expected, valueOne, valueTwo   
          {3, 2, 1},  //expected, valueOne, valueTwo   
          {7, 6, 1},  //expected, valueOne, valueTwo   
       });
    }

    @Test
    public void sum() {
       Calculator calc = new Calculator();
       assertEquals(expected, calc.add(valueOne, valueTwo), 0);
       //assertEquals(expected, calc.add(valueOne, valueTwo));
    } 
}