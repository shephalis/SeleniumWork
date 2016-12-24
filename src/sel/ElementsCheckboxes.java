package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsCheckboxes {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://html.com/input-type-checkbox/");
		List <WebElement> cb=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		for(int i=0;i<cb.size();i++)
		{
			   WebElement CheckB= cb.get(i);
			   CheckB.click();  
		}
	 
	}

}
