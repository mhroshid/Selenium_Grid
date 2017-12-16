/**
 * 
 */
package com.Flipkart.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Flipkart.LoginPage;

/**
 * @author Roshid
 *
 */
public class VerifyFlipkartLogin {
	@Test
	public void verifylogin() throws InterruptedException {
    
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    
    LoginPage login = new LoginPage (driver);
    
    login.loginbutton();
    Thread.sleep(5000);
    login.userid();
    Thread.sleep(5000);
//    login.pwd();
//    Thread.sleep(5000);
    
//    driver.quit();
	}
}
