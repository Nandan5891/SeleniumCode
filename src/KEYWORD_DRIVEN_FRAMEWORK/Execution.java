package KEYWORD_DRIVEN_FRAMEWORK;

public class Execution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String path="F:\\EXCELDATA\\KEYWORD.xlsx";
		ExecuteUtility.setexcel(path, 0);
		
		for(int i=0;i<=3;i++)
		{
			String keyword= ExecuteUtility.getdata(i, 3);
			if(keyword.equals("openbrowser"))
			{
				ActionKeyword.operation();
				
			}
			else if(keyword.equals("navigate"))
			{
				ActionKeyword.navigate();
			}
			
			else if(keyword.equals("click_DF"))
			{
				ActionKeyword.click_DF();
			}
			
		}
		

	}

}
