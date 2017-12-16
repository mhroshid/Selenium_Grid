package com.SumonHomework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW2Sample extends HW2Base {
	public WebDriver driver;
	public HW2Sample(WebDriver driver){
		this.driver = driver;
	}
//	public By Register = By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[2]/a");
//	public WebElement getRegister(){
//		return driver.findElement(Register);
//	}
//	public By fName = By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[1]/input");
	public By fName = By.id("u_0_9");
	public WebElement getfName(){
		return driver.findElement(fName);
	}
//	public By lName = By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input");
	public By lName = By.id("u_0_b");
	public WebElement getlName(){
		return driver.findElement(lName);
	}
//	public By email = By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input");
	public By email = By.id("u_0_e");
	public WebElement getemail(){
		return driver.findElement(email);
	}
	public void formFillUp(String fName, String lName, String email){
//		getRegister().click();
		getfName().clear();
		getfName().sendKeys(fName);
		getlName().clear();
		getlName().sendKeys(lName);
		getemail().clear();
		getemail().sendKeys(email);
	}
}
