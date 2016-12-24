package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Verify home page of actitime with Title of the page
public class VeriFyHomePage {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		System.out.println("Title of the page is => "+actualTitle);
		
		String expectedTitle="actiTIME - Enter Time-Trac";
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Home page reached");
		}
		else
		{
			System.out.println("Not the home page");
		}
		
		driver.close();
	}

}
