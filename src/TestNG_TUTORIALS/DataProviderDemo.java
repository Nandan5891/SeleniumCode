package TestNG_TUTORIALS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
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
	
	@Test(dataProvider="UserPassword") // access the data from dataprovider class
	public void login(String username, String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	driver.close();
	}
	
	@DataProvider(name="UserPassword")
	public Object[][] getdata()
	{
		Object[][]data= new Object[3][2];
		
		data[0][0]="Username1";
		data[0][1]="pass1";
		
		data[1][0]="Username2";
		data[1][1]="pass2";
		
		data[2][0]="Username3";
		data[2][1]="pass3";
		
		return data;
	}
}
