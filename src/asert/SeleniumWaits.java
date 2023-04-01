package asert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWaits {
	
	// Selenium Waits 
	
	public void waits() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get(url);
		System.out.println("Browser Launched");
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		// 1. Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");

	}
	
	
}
