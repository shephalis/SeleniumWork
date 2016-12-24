package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class SetProperties {

	public static void fromProp(String fName, String key,String val, String text) throws Exception
	{
		
	File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/"+fName+".properties");
	FileInputStream fis=new FileInputStream(f);
	FileOutputStream fos=new FileOutputStream(f,true);

	Properties prop=new Properties();
	prop.load(fis);
	prop.setProperty(key, val);
	prop.store(fos, text);
	
	
}
}