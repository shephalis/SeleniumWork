package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.flipkart.com");
		//WebElement we=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		driver.get("https://www.zoho.com/login.html");
		WebElement we=driver.findElement(By.xpath("//a[text()='Finance']"));
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Expense')]")).click();
		//driver.findElement(By.xpath("//span[text()='Lenovo']")).click();
	}

}
