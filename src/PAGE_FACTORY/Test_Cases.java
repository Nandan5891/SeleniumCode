package PAGE_FACTORY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Cases {

	static WebDriver driver;
	Login_Page loginpage;

	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

		loginpage=PageFactory.initElements(driver, Login_Page.class);
	}

	@Test
	public void test()
	{
		loginpage.LoginAction("RamNandan","abcd123");
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.quit();
	}

}

