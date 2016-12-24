package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleClickLinks {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		 WebElement we= driver.findElement(By.id("lst-ib"));
		 we.sendKeys("selenium",Keys.ENTER);
		
	
		//Listing all selenium links 
		List <WebElement> links=driver.findElements(By.xpath("(//h3/a)"));
	
	
		//checking all links text
		for(int i=5;i<links.size();i++)
			{
			links=driver.findElements(By.xpath("(//h3/a)"));
			links.get(i).click();;
			Thread.sleep(10000);
			String title=driver.getTitle();
			System.out.println(title);
			driver.navigate().back();
		}
		driver.close();
		}
		
	}


