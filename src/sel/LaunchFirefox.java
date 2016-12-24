package sel;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
		
		FirefoxDriver f= new FirefoxDriver();
		f.navigate().to("https://www.google.com");
		f.close();
	}

}
