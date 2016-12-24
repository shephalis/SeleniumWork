package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetDataExcel {

	public static void fromExcel(String fName,String sName, 
								int rNum,int cNum, String data)
	{
			
		try{
		File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/"+fName+".xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s=wb.getSheet(sName);
		Row r=s.createRow(rNum);
		
		Cell c=null;
		
		try {
		
			c=r.getCell(cNum);		
			c.setCellValue(data);
		}
		catch(NullPointerException e)
		{
			c=r.createCell(cNum);
			c.setCellValue(data);
		}
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		}
		
		catch(Exception e)
		{
		}
		
			
	}
}
	     