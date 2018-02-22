package EXCELDATA_UPLOADING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	/**
	 * @param args
	 * This program write the data in excel sheet
	 * @throws Exception 
	 * @throws Exception 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		
			File src=new File("F:\\EXCELDATA\\TESTDATA.xlsx");
			
			FileInputStream fis= new FileInputStream(src);
			
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			
			XSSFSheet sheet1= wb.getSheetAt(0);
			
			sheet1.getRow(0).createCell(1).setCellValue("Rahul Saxena");
		
			FileOutputStream fout= new FileOutputStream(src);
			
			wb.write(fout);
			
			System.out.println("Writing file is successfully");
		
			wb.close();		
	}
}
