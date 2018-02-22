package DATA_DRIVEN_FRAMEWORK;

public class Execute {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		String path="F:\\EXCELDATA\\ContactDetails.xlsx";
		ExcelUtility.Excelreader(path);
		
		ExcelUtility.getdata(0);
		 
		}

}
