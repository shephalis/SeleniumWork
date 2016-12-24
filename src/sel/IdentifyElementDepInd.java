package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyElementDepInd {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Isha/Desktop/Selenium_Practise/HTML_code/StyleTest.html");
		
		//in case language Table check-box is dynamic (dependent on position of lang
		driver.findElement(By.xpath("//tr[td[text()='Java']]/td/input[@type='Checkbox']")).click();;
	
	}

}
