
package ALERTWINDOW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo {
	
	
	@Test
	public void first() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		WebElement SubmitButton=driver.findElement(By.id("searchBtn"));
		
		SubmitButton.click();
		
		Thread.sleep(5000);
		
		//Alert act=driver.switchTo().alert();
		//act.accept();
		
		String acutal_alertmsg=driver.switchTo().alert().getText();
		
		System.out.println("Acutal Alert msg is:"+acutal_alertmsg);
		
		String expected_alertmsg="Please select start";
		
		Assert.assertEquals(acutal_alertmsg, expected_alertmsg);
		
		
		driver.switchTo().alert().accept(); // same as above code in single line
		
	}

}
// driver.switchTo().alert().dismiss is used to where pop contains accept and reject , dismiss is used for rejecct