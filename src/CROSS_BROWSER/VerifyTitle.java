/**
 * 
 */
package CROSS_BROWSER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Ram Nandan Thakur
 * This test will execute on different browser with the help of xml file
 * 
 */
public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")

	public void title(String browsername)
	{

		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}

		else if (browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		driver.quit();
	}

}
