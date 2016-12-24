package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyCheckBoxIsChecked {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		
		boolean actualStatus=checkbox.isSelected();
		if(actualStatus==true)
		{
			System.out.println("CheckBox is already checked");
		}
		else
		{
			System.out.println("unchecked");
			checkbox.click();
		}
		
	}

}
