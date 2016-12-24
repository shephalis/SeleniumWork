package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActionOnWE {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.firefox.marionette",
					"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			driver.get("https://www.irctc.co.in");
			WebElement ele=driver.findElement(By.id("usernameId"));
			ele.sendKeys("jfesdsa");
			
			//two ways to re-input text
			//ele.clear();	OR
			ele.sendKeys(Keys.CONTROL,"a");
			
			ele.sendKeys("shephali");
			//driver.get("https://www.google.com");
			//driver.findElement(By.id("gs_htif0")).sendKeys("hh");
	}
}
