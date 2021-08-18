package testjunitfivee;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void calculatorTest_addition_twonum() {
		Calculator cal=new Calculator();
		int expected=2;
		int actual=cal.add(1,1);
		//	 Assertions.
		assertEquals(expected,actual);
	}
	@Test
	void calculatorTest__GivenEmptyString_ShouldReturnsZero() {
		Calculator cal=new Calculator();
		int expected=0;
		int actual=cal.add("");
		assertEquals(expected,actual);
	}
	@Test
	void calculatorTest_GivenString_ShouldReturnsStringValue() {
		Calculator cal=new Calculator();
		int expected=2;
		int actual=cal.add("2");
		assertEquals(expected,actual);
	}
	@Test
	void calculaatorTest_GivenTwoNumbersSeperatedByEnter_ShouldReturnAddition() {
		Calculator cal=new Calculator();
		int expected=2;
		int actual=cal.add(1,"\n",1);
		assertEquals(expected,actual);
	}
}
