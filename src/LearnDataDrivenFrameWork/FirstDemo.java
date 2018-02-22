package LearnDataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FirstDemo {
	
	@Test
	public void exceldat()
	{
	
	try
	{
	File src= new File("F:\\EXCELDATA\\TESTDATA.xlsx");
	
	FileInputStream fis= new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	
	XSSFSheet sheet= wb.getSheetAt(0);
	
	String firstname=sheet.getRow(0).getCell(0).getStringCellValue();
	String pass= sheet.getRow(1).getCell(1).getStringCellValue();
	
	System.out.println("FirstName is: "+firstname);
	System.out.println("Password is: "+pass);
	wb.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception is: "+e.getMessage());
	}
	}
}