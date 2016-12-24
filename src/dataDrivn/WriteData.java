package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws Exception {
		
		File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/DataDriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Cell c=null;
		Row r=null;
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		r=s.createRow(6);
		c=r.createCell(2);
		c.setCellValue("shephali");

	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	
	}

}
