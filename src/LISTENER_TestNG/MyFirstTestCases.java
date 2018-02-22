package LISTENER_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//for suite level listener we have to delete @Listeners(LISTENER_TestNG.TestNG_Listener.class) and mention in xml file 
//@Listeners(LISTENER_TestNG.TestNG_Listener.class) // class level listener
public class MyFirstTestCases {

	@Test
	public void FacebookTitleVerify()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actual_title=driver.getTitle();
		System.out.println("Actual title is:" +actual_title);
		driver.quit();
	}

	@Test
	public void TitleMatch()
	{
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}
}
