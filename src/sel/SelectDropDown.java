package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Isha/Desktop/Selenium_Practise/HTML_code/Test.html");
		
		WebElement we= driver.findElement(By.xpath("//Select[1]"));
		
		Select st=new Select(we);
		st.selectByIndex(5);
		st.selectByValue("01");
		st.selectByVisibleText("North meals");
		
		
		
		
	}

}
