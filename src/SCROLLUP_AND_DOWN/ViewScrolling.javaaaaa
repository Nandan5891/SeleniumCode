package SCROLLUP_AND_DOWN;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewScrolling {

	@Test
	public void second() throws Throwable
	{
	System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	
	//Identify the element which will appear after scrolling
	//WebElement element=driver.findElement(By.xpath("//*[@id='mCSB_3_container']/p[5]"));
	
	WebElement element= driver.findElement(By.xpath("//*[@id='mCSB_4_container']/p[5]"));
	
	// Create instance of javascript executor
	JavascriptExecutor je= (JavascriptExecutor)driver;
	
	Thread.sleep(4000);
	
	//execute the query u element is not visible on page
	je.executeScript("arguments[0].scrollIntoView(true);", element);
	
	// Text Verify
	System.out.println(element.getText());
	
	}
}
