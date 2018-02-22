package KEYWORD_DRIVEN_FRAMEWORK;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecuteUtility {

	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public static void setexcel(String path, int sheetno)
	{
		
		try
		{
			File src= new File(path);
			FileInputStream fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(sheetno);
		}
		catch (Exception e) 
		{
			System.out.println("Exception is: "+e.getMessage());	
		}
	}
	public static String getdata(int rowno, int colno)
	{
		String data=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
	}
}
