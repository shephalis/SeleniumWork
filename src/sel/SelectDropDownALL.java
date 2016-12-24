package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownALL {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Isha/Desktop/Selenium_Practise/HTML_code/Test.html");
		
		WebElement we= driver.findElement(By.xpath("//select[2]"));
		Select st=new Select(we);
		st.selectByIndex(2);
		st.selectByValue("04");
		st.selectByVisibleText("Curd rice");
		st.deselectByIndex(2);
		
		//checking type of dropdown(single select/multiselect)
				boolean status=st.isMultiple();
				if(status==true){
					System.out.println("muiltiple options can be selected");
				}
				else{
					System.out.println("single option");
				}
				
		//displaying all options
				//Check if expected option is selected

				String expected="Veg biryani";
				boolean flag=false;
				
		List<WebElement> dl= st.getOptions();
		for(int i=0;i<dl.size();i++){
		
			WebElement s=dl.get(i);
			String actual=s.getText();
			System.out.println(s.getText());
			
			if(expected.equals(actual))
			{
				flag=true;
			}
		}
			
			if(flag==true)
			{
				System.out.println("Actual is same as expected i.e "+expected);
			}
			else
			{
				System.out.println("not same options");
			}
						
		
		//selecting all options
		for(int i=0;i<dl.size();i++)
		{
		st.selectByIndex(i);
		}
		
		
		 
	}
}
