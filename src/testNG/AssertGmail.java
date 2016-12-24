package testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertGmail {
	
	WebDriver driver=null;
	@BeforeMethod
	public void preconditon(){
	System.setProperty("webdriver.firefox.marionette",
			"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	  @AfterMethod
	  public void postCondition(){
	  driver.close();
  }
	 
	  
  @Test
  public void testPlaceholder() {
	  driver.get("https://www.gmail.com");
	  String actualPH=driver.findElement(By.id("Email")).getAttribute("placeholder");
	  String expectedPH="Enter your email";
	  AssertJUnit.assertEquals(actualPH, expectedPH);
	  }
  
  @Test
  public void verifyEmailIDBoxText() throws Exception
  {
	  driver.get("https://www.gmail.com");
	  //Invalid text is put
	  driver.findElement(By.id("Email")).sendKeys("()!IH");
	  driver.findElement(By.id("next")).click();
	  Thread.sleep(5000);
	WebElement errorMsg=driver.findElement(By.id("errormsg_0_Email"));  
	
  AssertJUnit.assertEquals(errorMsg.getText(),"Please enter a valid email address.");	
  System.out.println("This line should be executed");
  
  //or below boolean value should be true
  AssertJUnit.assertEquals(errorMsg.isDisplayed(), false);
  //below line will not be executed bcoz test is failing with assert
  System.out.println("Invaid characters");
  }
  
}
