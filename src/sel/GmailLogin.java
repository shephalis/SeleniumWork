package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");
		//driver.findElement(By.linkText("sign in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("writeshephali");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("hfakj");
		driver.findElement(By.id("signIn")).click();
		
		driver.close();
		
		

	}

}
