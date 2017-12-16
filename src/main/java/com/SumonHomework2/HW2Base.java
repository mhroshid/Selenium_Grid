package com.SumonHomework2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Base {
	public WebDriver driver = null;
	public WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", ("C:/Selenium/Drivers/chromedriver.exe"));
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
