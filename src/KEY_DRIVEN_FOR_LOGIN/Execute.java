package KEY_DRIVEN_FOR_LOGIN;

public class Execute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String path="F:\\EXCELDATA\\MEDIMENTION.xlsx";
		ExcelReader.exceldata(path);

		for(int i=0;i<=6;++i)
		{
			String keyword=ExcelReader.getdata(i, 3);
			if(keyword.equals("openbrowser"))
			{
				ActionKeyword.openbrowser();
			}
			else if (keyword.equals("navigate"))
			{
				ActionKeyword.navigate();	
			}
			else if (keyword.equals("Click_Home"))
			{
				ActionKeyword.Click_Home();	
			}
			else if (keyword.equals("Click_Login"))
			{
				ActionKeyword.Click_Login();	
			}
			else if (keyword.equals("TextBoxEnter"))
			{
				ActionKeyword.TextBoxEnter();
			}
			else if (keyword.equals("Click_Submit"))
			{
				ActionKeyword.Click_Submit();
			}
		}
	}

}
