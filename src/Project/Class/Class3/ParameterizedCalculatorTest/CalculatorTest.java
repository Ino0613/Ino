package Project.Class.Class3.ParameterizedCalculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(20, 50);
        assertEquals(70, result, 0);
    }
}