
package DATA_DRIVEN_FRAMEWORK;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static void Excelreader(String path)
	{

		try
		{
			File src= new File(path );
			FileInputStream fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		}
		catch (Exception e)
		{
			System.out.println("Exception is:  "+e.getMessage());
		}

	}

	public static void getdata(int sheetno) 
	{
		sheet=wb.getSheetAt(sheetno);
		int totalrow=sheet.getLastRowNum();

		for(int i=1;i<=totalrow;++i)
		{
			for(int j=0;j<=3; ++j)
			{
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Details are following:"+data);				
			}

		}				
	}
}