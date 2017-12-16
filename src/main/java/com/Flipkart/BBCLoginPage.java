/**
 * 
 */
package com.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Roshid This class will store all the locators and method
 */
public class BBCLoginPage 
{
	WebDriver driver;

	By login = By.xpath(".//*[@id='idcta-username']");
	By uid = By.xpath(".//*[@id='idcta-username']");
//	By uid = By.cssSelector("._2zrpKA");
	                   
	By password = By.xpath(".//*[@id='password-input']");

	public BBCLoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void loginbutton() 
	{
		driver.findElement(login).click();
	}
    public void userid ()
    {
    	driver.findElement(uid).sendKeys("mhroshid@hotmail.com");
    }
//    public void pwd ()
//    {
//    	driver.findElement(password).sendKeys("Test123");
//    }
}
