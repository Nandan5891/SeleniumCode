package TEST_FAILURE_SCREENSHOT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import LIBRARAY.ScrShots;

public class FailureScreenshot {

	WebDriver driver;
	
	@Test
	public void Invalid() 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("http://www.medimention.com");
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("UserUsername")).sendKeys("Nandan");
		driver.findElement(By.id("UserPassword")).sendKeys("abcd1234");
		
		driver.findElement(By.xpath("//button[@type='submmmit']")).click(); // here x path is invalid for button
	
	}
	
	@Test
	public void Valid() 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("http://www.medimention.com");
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("UserUsername")).sendKeys("Nandan");
		driver.findElement(By.id("UserPassword")).sendKeys("abcd1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // here x path is Valid
	
	}
	
	@AfterMethod
	public void close(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			ScrShots.captureScreenshot(driver, result.getName());	
		}
		
		else if(ITestResult.SUCCESS==result.getStatus())
		{
			ScrShots.captureScreenshot(driver, result.getName());
		}
		
		driver.quit();
	}
}
