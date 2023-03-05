package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
    WebDriver driver;
	
	// TestCases
	@Test (priority = 1)
	public void testCaseOne() {
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Test Case One Passed");
	}

	@Test (priority = 2)
	public void testCaseTwo() {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Test Case Two Passed");
	}
	
	@Test (priority = -3)
	public void testCaseThree() {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Admin34");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("ad4min123");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Test Case Three Passed");
	}

	@Test (priority = 0)
	public void testCaseFour() {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("admin112323");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Test Case Four Passed");
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.facebook.com/login/device-based/regular/login/";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser has Launched");

		driver.manage().window().maximize();
		System.out.println("Browser Maximize");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
