package asert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConcept {
	
	// Assert: Asserts are validations or checkpoints for an application.
	// It well check the application's behavior is working as expected.
	
	@Test
	public void assertVerification() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get(url);
		System.out.println("Browser Launched");
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title Not Matched");
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive", "URl not matched: ");

	}

}
