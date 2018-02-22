package SCROLLUP_AND_DOWN;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDemo {
	@Test
	public void first() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://jqueryui.com/");

		Thread.sleep(4000);

		//((JavascriptExecutor)driver).executeScript("scroll(0,700)");

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scroll(0,700)");


	}


}

