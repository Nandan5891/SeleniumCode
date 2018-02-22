package GETCSSVALUES;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	/**
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/");
		
		String font_size=driver.findElement(By.id("username")).getCssValue("font-size");
		System.out.println("Size of font is:" +font_size  );
		
		String logincolor=driver.findElement(By.id("Login")).getCssValue("color");
		System.out.println("Login Color is:  "+logincolor);
		
		String loginbgcolor=driver.findElement(By.id("Login")).getCssValue("background-color");
		System.out.println("Login Color is:  "+loginbgcolor);
		
	
		System.out.println("=====Color Based on Co ordinate===========");
		//Getpixel color using coordinate
		Robot r= new Robot();
		
		System.out.println(r.getPixelColor(10, 20));
		System.out.println(r.getPixelColor(40, 50));
		System.out.println(r.getPixelColor(110, 120));
		
		
	}

}
