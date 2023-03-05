package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGLogin {
	
	// TestCases
	@Test
	public void testCaseOne() {
		System.out.println("Test Case One");
	}

	@Test
	public void testCaseTwo() {
		System.out.println("Test Case Two");
	}
	
	@Test
	public void testCaseThree() {
		System.out.println("Test Case Three");
	}

	@Test
	public void testCaseFour() {
		System.out.println("Test Case Four");
	}

	@BeforeMethod
	public void beforeMethod() {
		 System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		 System.out.println("After Method");
	}

}
