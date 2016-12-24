package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyElementXPath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
/*		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=r4IrWI_-BqTT8geXr7TYAg&gws_rd=ssl");
		
		//xpath using text() function
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(ele1.getText());
		
		//xpath using Contains
		WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'Image')]"));
	System.out.println(ele2.getText());
	*/
	
/*		driver.get("https://www.irctc.co.in");
		
	WebElement ele4=driver.findElement(By.xpath("//span[contains(text(),'Facility for')]"));	
	System.out.println(ele4.getText());
	
	WebElement ele3=driver.findElement(By.xpath("//span[contains(text(),'SMS delivery')]"));
	System.out.println(ele3.getText());
		
	WebElement ele5=driver.findElement(By.xpath("//div[contains(text(),'IRCTC Attr')]"));
	System.out.println(ele5.getText());
	
*/
		
		driver.get("https://www.yatra.com");
		
	WebElement ele1=driver.findElement(By.id("cutomerSupportNav"));
	
	WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'Round')]/i"));
	
	
	WebElement ele3=driver.findElement(By.xpath("//span[text()='Yatra Specials']"));
	
	WebElement ele4=driver.findElement(By.xpath("//div[@id='extremePadCont']/h2"));
	ele2.click();
	System.out.println(ele3.getText());
	System.out.println(ele4.getText());
	ele1.click();
	}

}
