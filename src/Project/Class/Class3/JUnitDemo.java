package Project.Class.Class3;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class JUnitDemo {
    AdditionOperation add = new AdditionOperation();

    @Before
    public void setUp() throws Exception{
        System.out.println(add);
    }

    @Test
    void testCalculation(){
        assertEquals(add.calculate(20,30),50);
    }

    @Test
    public void testGetResult(){
        add = new AdditionOperation();
//        assertEquals(add.getResult(),);
    }
}
