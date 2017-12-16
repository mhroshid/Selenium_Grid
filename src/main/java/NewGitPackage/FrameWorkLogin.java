package NewGitPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

  public class FrameWorkLogin {
		int  i ;
	  @Test
		public  void  MyTest2() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.amazon.com");
			
			WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]/span[2]"));
			Actions act = new Actions(driver);
			Thread.sleep(5000);
			act.moveToElement(element).perform();
			
			String xp1 ;
			String xp2 ;
			String xp  ;
			
			xp1 = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[";
			xp2 = "]/span";
			
			for (i = 1; i<21;i++) {
				System.out.println(driver.findElement(By.xpath(xp1+i+xp2)).getText());
			}
			
			
			 Thread.sleep(6000);
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/a/span")).getText());
			
			
				Thread.sleep(6000);
				driver.close();

			}

		}
