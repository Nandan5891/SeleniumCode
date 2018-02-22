package KEY_DRIVEN_FOR_LOGIN;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public static void exceldata(String path)
	{

		try 
		{
			File src= new File (path);
			FileInputStream fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(0);
		} 
		catch (Exception e)
		{
			System.out.println("Exception is:  "+e.getMessage());
		}

	}
	public static String getdata(int rowno, int colno)
	{
		String data=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
	}


}
