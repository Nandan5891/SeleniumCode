/**
 * 
 */
package TestNG_TUTORIALS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Ram Nandan Thakur
 *this test findout the title of page
 */


public class VerifyTitle {
	
	@Test (enabled=false)
	public void title()
	{
		
	System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	String actual_title=driver.getTitle();
	
	System.out.println("Actual title is:" +actual_title);
	
	//String expected_title="Facebook – log in or sign up";
	
	//Assert.assertEquals(actual_title, expected_title); // It checks total element 
	
	Assert.assertTrue(actual_title.contains("Facebook – log in or sign")); // it executes even if it matches the partial element
	
	System.out.println("Test completed and page has been verified");
	
	}

	@Test
	public void pagesource()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
			
		String pagesource=driver.getPageSource();
		
	System.out.println("PageSource is: "+pagesource);
	}
}
