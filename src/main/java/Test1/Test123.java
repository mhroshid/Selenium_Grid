package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test123 {
	@Test 
	public void testingGrid () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://bbc.com");
		Thread.sleep(5000);
		driver.quit();
		
	}

}

