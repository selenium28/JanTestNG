package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTestNG {

//	public static void main(String[] args) {
//		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//
//		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		System.out.println("Browser has Launched");
//
//		driver.manage().window().maximize();
//		System.out.println("Browser Maximize");
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//	}
	
	@Test
	public void display() {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser has Launched");

		driver.manage().window().maximize();
		System.out.println("Browser Maximize");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

}
