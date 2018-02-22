package POPUP_WINDOW_OR_BOOTSTRAP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popwindow {

	@Test
	public void testPopupwindow()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.id("get_sign_up")).click();
		
		driver.switchTo().frame("authiframe"); // Switching in frame
		
		driver.findElement(By.id("authMobile")).sendKeys("1234567890");
		
	//	driver.quit();
		
	}
	
}
