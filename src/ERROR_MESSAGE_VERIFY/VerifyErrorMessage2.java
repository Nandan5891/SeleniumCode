package ERROR_MESSAGE_VERIFY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage2 {
	
	//verify error message by getAttribute method
	
		@Test
		public void mytest() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://gmail.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		//Thread.sleep(10000);
		
		String Actual_errormsg=driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");

		System.out.println("Error message is:  "+Actual_errormsg);
		
		String Expected_errormsg="Enter an email or phone number";
		
		//Type 1
		Assert.assertEquals(Actual_errormsg, Expected_errormsg);
		
		System.out.println("Test Successful Completed");
		
		//Type 2
		//Assert.assertTrue(Actual_errormsg.contains("Enter an email or phone"));
		//System.out.println("Test Successful Completed");	
		
		// Assert.assertTrue method return even if returns some part of string
	}
}
