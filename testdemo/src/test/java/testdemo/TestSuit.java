package testdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;
public class TestSuit {
	@RunWith(Suite.class)
	@SuiteClasses({ TestClass.class, TestClassA.class })
	public class ClassTestSuite {
}
}
