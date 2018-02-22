package EXCELDATA_UPLOADING;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	WebDriver driver;

	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
	}

	@Test(dataProvider="Username&Password") // access the data from dataprovider class

	public void login(String username, String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}

	@DataProvider(name="Username&Password")
	public Object[][] getdata() throws Exception
	{

		File src= new File("F:\\EXCELDATA\\TESTDATA.xlsx");

		FileInputStream fis= new FileInputStream(src);

		XSSFWorkbook wb= new XSSFWorkbook(fis);

		XSSFSheet sheet=wb.getSheetAt(0);

		int totalrow=sheet.getLastRowNum();

		Object[][]data= new Object[totalrow][2];

		System.out.println("Total No of Row is: "+totalrow);

		for(int i=0;i<totalrow;++i)
		{
			for(int j=0;j<=1;++j)
			{
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		wb.close();
		return data;

	}

}
