package WAIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ExplicitWaitDemo {
	
	@Test
	
	public void explicit() 
	{
	
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		long t1=System.currentTimeMillis(); // it return millisecond from 1 Jan 1970 Midnight
		
		try
		{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgotten accoun?']")));
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is: " +e.getMessage());
		}
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		long t2=System.currentTimeMillis();
		
		double timetaken=(t2-t1)/1000; // Convert into seconds.
		
		System.out.println("Total Execution time taken: "+timetaken+"Seconds");	
	}
}
