package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateURL {

	public static void main(String[] args) {
	System.setProperty("webdriver.firefox.marionette","D://geckodriver-v0.11.1-win32/geckodriver.exe/");
	
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
