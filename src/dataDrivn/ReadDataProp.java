package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataProp {

	public static void main(String[] args) throws Exception {
		
		File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/cData.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
	System.out.println(prop.getProperty("browsername"));
	System.out.println(prop.getProperty("URL"));
   }

}
