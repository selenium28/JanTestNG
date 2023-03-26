package para;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver;
	String browser = "firefox";
	@Test
	public void broswerMethod() {

		String url = "https://www.facebook.com/login/device-based/regular/login/";
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			
			ChromeOptions option = new ChromeOptions();
	        option.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(option);

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Browser2/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Browser Maximize");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
}
