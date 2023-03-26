package para;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupingClass {
	
	@Test (groups = {"smoke"})
	public void testCaseOne() {
		System.out.println("Test Case smoke");
	}

	@Test (groups = {"smoke"})
	public void testCaseTwo() {
		System.out.println("Test Case smoke");
	}

	@Test (groups = {"smoke" , "regression"})
	public void testCaseThree() {
		System.out.println("Test Case smoke & regression");
	}

	@Test (groups = {"regression"})
	public void testCaseFour() {
		System.out.println("Test Case regression");
	}

	@Test (groups = {"regression"})
	public void testCaseFive() {
		System.out.println("Test Case regression");
	}

	@Test (groups = {"regression"})
	public void testCaseSix() {
		System.out.println("Test Case regression");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
