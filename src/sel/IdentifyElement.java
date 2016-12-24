package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Isha/Desktop/Selenium_Practise/HTML_code/StyleTest.html");
		
		//Call By class method for tagname "p"	
			By ob= By.tagName("p");
			
			WebElement element=driver.findElement(ob);
			System.out.println(element.getText());
			
		//call By class method tagname " label"	
			
			By ob1=By.tagName("label");
			WebElement element1= driver.findElement(ob1);
			System.out.println(element1.getText());
			
		//call By class method tagname  "input"
			
			WebElement element2=driver.findElement(By.tagName("input"));
			element2.sendKeys("ghjooa");
			
		//call By class method id="t1"	
			
			By ref=By.id("t1");
			WebElement elem=driver.findElement(ref);
			System.out.println(elem.getText());
			
		//call By class method 	classname "p1"
			
			By ob2=By.className("p1");
			WebElement element3=driver.findElement(ob2);
			System.out.println(element3.getText());
			
		//call By class method name "honey"	
			
			By ob3=By.name("honey");
			WebElement element4=driver.findElement(ob3);
			System.out.println(element4.getText());
		
		//cll By class method linkText "a"
			
			By ob4=By.linkText("Google link");
			WebElement element5=driver.findElement(ob4);
			System.out.println(element5.getText());
			driver.close();
		}	

}
