package testdemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class CalculatorTestSuit {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@RunWith(Suite.class)
	@SuiteClasses({ TestClass.class, TestClassA.class })public class ClassTestSuite {
	}

}
