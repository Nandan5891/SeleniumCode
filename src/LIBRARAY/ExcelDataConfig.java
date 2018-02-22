package LIBRARAY;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath) 
	{
	try 
	{
		File src=new File(excelpath);
		
		FileInputStream fis= new FileInputStream(src);
		
		wb= new XSSFWorkbook(fis);
	
	} 
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}

	}
	
	public String getdata(int sheetno, int rowno, int columnno)
	{
		sheet1= wb.getSheetAt(sheetno);	
		String data=sheet1.getRow(rowno).getCell(columnno).getStringCellValue();
		return data;
	}
	
}
