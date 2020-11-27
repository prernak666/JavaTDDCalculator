package calculatorJava;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void ReturnZeroOnEmptyStringtest() {
		assertEquals(0,Calculator.add(""));
	}

	public void ReturnSameOnOneArgumenttest() {
		assertEquals(1,Calculator.add("1"));
	}

    public void ReturnSumOfTwoNumbersDelimitedByComma() {
    	assertEquals(3,Calculator.add("1,2"));
    }
    @Test
    public void ReturnSumOfUnknownNumbersDelimitedByComma() {
    	assertEquals(6,Calculator.add("1,2,3"));
    }
    @Test
    public void ReturnSumOfUnknownNumbersDelimited() {
    	assertEquals(6,Calculator.add("1,2\n3"));
    }
    @Test
    public void ReturnSumwithMultipleNumberOfDelimited() {
    	assertEquals(3,Calculator.add("//;\\n1;2"));
    }
    @Test
    void ReturnEXceptionOnNegative() {
    	
    	Exception exception = assertThrows(RuntimeException.class, () -> {
            Calculator.add("1,-2,-3,9,-4");
        });
     
        
     
        assertEquals("Negatives not allowed: [-2, -3, -4]",exception.getMessage());
    } 
}