/**
 * 
 */
package com.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Roshid This class will store all the locators and method
 */
public class LoginPage 
{
	WebDriver driver;

	By login = By.xpath("//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a");
	By uid = By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
//	By uid = By.cssSelector("._2zrpKA");
	                   
	By password = By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form");

	public LoginPage(WebDriver driver) 
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
