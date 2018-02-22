package MOUSEH_HOVER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_color_picker {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/slider/#colorpicker");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);	
		
		WebElement source=driver.findElement(By.xpath("//*[@id='red']/span"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(source).moveByOffset(40, 0).release(source).build().perform();
		
		Thread.sleep(2000);
		
		act.clickAndHold(source).moveByOffset(-50, 0).release(source).build().perform();
		
		
	}

}
