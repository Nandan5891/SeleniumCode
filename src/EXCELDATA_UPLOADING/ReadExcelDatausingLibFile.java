package EXCELDATA_UPLOADING;

import LIBRARAY.ExcelDataConfig;

public class ReadExcelDatausingLibFile {

	/**
	 * @param args
	 * 
	 * This program read the excel data using library file(ExcelDataConfig) which is inside Library package
	 */
	
	public static void main(String[] args) {
		
		
			ExcelDataConfig obj= new ExcelDataConfig("F:\\EXCELDATA\\TESTDATA.xlsx");
			//This is for sheetno 0
			System.out.println("This data is from sheet zero");
			System.out.println(obj.getdata(0, 0, 0));
			
			
			// This is for sheet no 1
			System.out.println("This data is from sheet1");
			System.out.println(obj.getdata(1, 0, 0));
	}

}
