package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleGetTitle {

	public static void main(String[] args)
	{

		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium",Keys.ENTER);
		driver.findElement(By.partialLinkText("Downloads")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleIs("Downloads"));
		System.out.println(driver.getTitle());
		driver.close();
		
		

	
	}
}
