package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("eiui",Keys.ENTER);
		
	}

}
