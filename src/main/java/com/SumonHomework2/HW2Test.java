package com.SumonHomework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HW2Test {
  @Test
  public void f() {
	  HW2Base b = new HW2Base();
	  WebDriver driver = b.getDriver();
	  HW2Sample s = PageFactory.initElements(driver, HW2Sample.class);
//	  String url = "http://demo.automationtesting.in/Slider.html";
	  String url = "https://www.facebook.com/";
	  driver.get(url);
//	  s.formFillUp("Sumon", "Zaman");
	  s.formFillUp("Sumon", "Zaman", "sumon@Yahoo.com");
  }
}
