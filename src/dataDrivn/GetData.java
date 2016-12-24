package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	public static String frameExcel(String fName, String ShName,
								int rIndex, int cIndex)
	{
		
		String data=null;
		
		try
		{
		File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/"+fName+".xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(ShName);
		Row r= s.getRow(rIndex);
		Cell c=r.getCell(cIndex);
		
		 data=c.toString();
		 
		} 
		
		catch (Exception e) {
	
		
		}
		return data;
		
		
	}

}
 