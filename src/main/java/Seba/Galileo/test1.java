package Seba.Galileo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/!Training/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://nytimes.com");
		
	}

}
