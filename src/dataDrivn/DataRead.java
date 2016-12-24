package dataDrivn;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataRead {

	public static void main(String[] args) throws Exception {
		
	File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/DataDriven.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("Sheet1");
	Row r=s.getRow(0);
	Cell c=r.getCell(0);
	String data=c.toString();
	System.out.println(data);
	
	int lastRow=s.getLastRowNum();
	int lastCell=r.getLastCellNum();
	
	System.out.println("total rows are  "+(lastRow+1));
	System.out.println("total columns are "+lastCell);
	
		for(int i=0;i<=lastRow;i++)
		{
			r=s.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{	
			
				System.out.print(r.getCell(j).toString()+" ");
			}
			System.out.println();
		}
	
	}

	                         
}
