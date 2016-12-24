package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyHomePageVisibleElement {

	public static void main(String[] args) {

		//Verify Home page wiih Logout link
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebElement logoutLink=driver.findElement(By.id("logoutLink"));
		boolean actualStatus=logoutLink.isDisplayed();
		boolean expectedStatus=true;
		
		if(actualStatus==expectedStatus)
		{
			System.out.println("Landed on home page");
		}
		else
		{
			System.out.println("not the home page");
		}
			
		driver.close();
	}

}
