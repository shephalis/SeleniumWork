package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownMenu {

	public static void main(String []args) throws InterruptedException
	{
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(10000);
		List<WebElement> autoSuggest=driver.findElements(By.xpath("(//div[@class='sbqs_c'])"));
		
		for(int i=0;i<autoSuggest.size();i++)
		{
			WebElement we=autoSuggest.get(i);
			System.out.println(we.getText());
						
		}
		String expected="javascript";
		
		for(int i=0;i<autoSuggest.size();i++)
		{
			WebElement link=autoSuggest.get(i);
			
		if(expected.equals(link.getText()))
		{
			link.click();
			break;
		}
		}
	}
}
