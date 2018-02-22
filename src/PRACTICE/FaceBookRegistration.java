package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://facebook.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_g")).sendKeys("Test");
		driver.findElement(By.id("u_0_i")).sendKeys("Selenium");
		driver.findElement(By.id("u_0_l")).sendKeys("1236547890");
		driver.findElement(By.id("u_0_s")).sendKeys("abcd1234");
		
		
		boolean chk1;
		chk1=driver.findElement(By.id("day")).isEnabled();
		System.out.println("Date:"+chk1);
		Select droplist= new Select (driver.findElement(By.id("day")));
		droplist. selectByValue("2");
		Select droplistmonth= new Select(driver.findElement(By.id("month")));
		droplistmonth.selectByVisibleText("Jul");
		Select droplistyear= new Select(driver.findElement(By.id("year")));
		droplistyear.selectByValue("2002");
		
	
		WebElement RadioButton= driver.findElement(By.id("u_0_3"));
		WebElement RadioButton2=driver.findElement(By.id("u_0_4"));
		boolean b;
		b=RadioButton.isEnabled();
		if(b)
		{
			RadioButton.click();
		}
		else
		{
		RadioButton2.click();	
			
		}
	//driver.findElementById("u_0_y").click();
//	WebElement monthlist= driver.findElement(By.id("month"));
	
	}

	
}

