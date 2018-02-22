package EXCELDATA_UPLOADING;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Upload2 {

	@Test
	public void logindetails() throws Exception
	{
		File src=new File("F:\\EXCELDATA\\TESTDATA.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		int totalrow= sheet1.getLastRowNum();
		
		for(int i=0;i<totalrow;++i)
		{
			String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username is:" +username); 
			
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password is:  "+password);
		}	
		
		wb.close();
	}
}
