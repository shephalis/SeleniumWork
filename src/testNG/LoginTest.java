package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class LoginTest {
		
  @Test(dataProvider = "getData")
  public void loginTest(String un, String pwd) {
	  
	  System.out.println("UserName= "+un);
	  System.out.println("Password= "+pwd);
  }

  @DataProvider
  public Object[][] getData() throws Exception  {
	  
	  Object[][] ob=new Object[5][2];
	  
	  File f=new File("C:/Users/Isha/Desktop/Selenium_Practise/DataProvider_2D.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("DP_2D");
		
			for(int i=0;i<=4;i++)
			{
				Row r=s.getRow(i);  
				for(int j=0;j<=1;j++)
				{	
					ob[i][j]=r.getCell(j).toString();
				}
			}
	  return ob;
  }
} 
