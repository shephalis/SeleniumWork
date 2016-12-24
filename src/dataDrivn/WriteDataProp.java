package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataProp {

	public static void main(String[] args) throws Exception {
		
		File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/cData.properties");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f,true);

		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty("URL", "https://www.yahoo.com");
		prop.store(fos, "Updated URL");
		
	}

}
