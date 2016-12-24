package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBCheckRadioButton {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		WebElement femaleRadio=driver.findElement(By.id("u_0_h"));
		WebElement maleRadio=driver.findElement(By.id("u_0_i"));
		
		boolean femaleOption=femaleRadio.isSelected();
		
		if(femaleOption==true)
		{
			System.out.println("Female radio button is checked");
			maleRadio.click();
		}
		else
		{
			femaleRadio.click();
		}
	}

}
