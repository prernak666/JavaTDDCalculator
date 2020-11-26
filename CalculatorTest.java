package calculatorJava;
import static org.junit.Assert.*;
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
}