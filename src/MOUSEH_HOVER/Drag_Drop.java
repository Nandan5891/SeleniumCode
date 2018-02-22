package MOUSEH_HOVER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);	
		
		/*WebElement loginButton=driver.findElement(By.xpath("//div[@id='draggable']"));
		loginButton.click();
		*/
		
		Thread.sleep(5000);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		
		// Alternative method
		
		//act.clickAndHold(source).moveToElement(target).release(source).build().perform();
		
		// We have to use .build when we perform multiple operation 
		
	}
	

}
