package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ColorVerification {

	@Test
	public void color()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.google.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String color=driver.findElement(By.id("gb_70")).getCssValue("color");
		System.out.println("Specified color is:    "+color);
		
		String[]hexvalue=color.replace("rgbc(","").replace(")","").split(",");
		
		System.out.println("Hexvalue is    :    "+hexvalue);
		
		hexvalue[0]=hexvalue[0].trim();
		
		int hexvalue1=Integer.parseInt(hexvalue[0]);
		
		System.out.println("hexvalue1=="+hexvalue1);
	}
}