package testNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMethods {
  
	WebDriver driver=null;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	@Test
  public void loginSuccess()
	{
		driver.findElement(By.id("Email")).sendKeys("writeshephali");
		driver.findElement(By.id("next")).click();
		System.out.println("Logged at pasword page");
		driver.navigate().back();
		System.out.println("back to login page");
	}
	
  
  @Test
  public void loginFail()
  {
	  driver.findElement(By.id("Email")).sendKeys("sdddsd");
	  driver.findElement(By.id("next")).click();
	  System.out.println("login unsuccessful");
  }
}
