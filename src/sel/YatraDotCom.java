package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YatraDotCom {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.yatra.com");
		WebElement ele1= driver.findElement(By.id("booking_engine_trains"));
		System.out.println(ele1.getAttribute("class"));
	//	driver.findElement(By.xpath("//li[@class='moreNav list-dropdown js_yt_header_top']/a")).click();
	//	driver.findElement(By.xpath("//li[@id='menu_hotels']")).click();
	}

}
