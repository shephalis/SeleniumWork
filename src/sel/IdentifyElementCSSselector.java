	  package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyElementCSSselector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
	driver.get("file:///C:/Users/Isha/Desktop/Selenium_Practise/HTML_code/StyleTest.html");

		
		//By using CSS selecor classname ".p1" , control will print only first occurrence 
		
			By ref=By.cssSelector(".p1");
			WebElement element=driver.findElement(ref);
			System.out.println(element.getText());
	
		/* driver.get("https://www.google.co.in");
		
		By ref=By.cssSelector("#lst-ib");
		WebElement element= driver.findElement(ref);
		element.sendKeys("java");
			*/

	//BY using CSS selector id "#1st-ib"
			
			By ref1=By.cssSelector("#lst-ib");
			WebElement element1=driver.findElement(ref1);
			element1.sendKeys("java");
			
	//BY using CSS selector classname ".uname.a" i.e when gap 
			//is there between words in class		
	
			By ref2=By.cssSelector(".uname.a");
			WebElement element2=driver.findElement(ref2);
			element2.sendKeys("abdhdk");
			
	// When id and class both the attributes are not there , will use
			// tagname[attribute='attribute value']
			
			By ref3=By.cssSelector("input[name='pass']");
			WebElement element3=driver.findElement(ref3);
			System.out.println(element3.getTagName());
			
			
	}

}
