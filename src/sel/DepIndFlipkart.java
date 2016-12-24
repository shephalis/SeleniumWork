package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DepIndFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?otracker=nmenu_sub_Electronics_0_Apple&sid=tyy%2F4io");
		
		// To Select Apple
		/*
		 1- dep=checkbox, ind=apple, CP=label
		 2-dep=//div[@class='_1p7h2j'] , ind=//div[text()='Apple']
		 3-dep=//label/div[@class='_1p7h2j'] , ind=//label/div[text()='Apple']
		 4&5- dep=/div[@class='_1p7h2j'] , ind=//label[div[text()='Apple']]
		 6- full xpath(ind+dep)= //label[div[text()='Apple']]/div[@class='_1p7h2j']
		 */
			
		driver.findElement(By.xpath("//label[div[text()='Apple']]/div[@class='_1p7h2j']")).click();
			

	}

}
