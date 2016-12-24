package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertNotIRCTC {
	
	WebDriver driver=null;
	 
	
  @Test
  public void maxCharInCaptcha() {
	  
	  
	  WebElement captcha=driver.findElement(By.name("j_captcha"));
	  String actualVal="iwehjakiuthrgfbhj";
	  captcha.sendKeys(actualVal);
	 
	  String avlVal=captcha.getAttribute("value");
	  Assert.assertNotEquals(actualVal, avlVal);
	  
  }
  @BeforeMethod
  public void preCondition() {
	  
	 
	  
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		
  }

  @AfterMethod
  public void postCondition() {
	driver.close();
	  
  }

}
