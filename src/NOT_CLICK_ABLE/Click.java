package NOT_CLICK_ABLE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	/**
	 * @param args
	 * check box will be clickable using Actions class for mouse hover otherwise it will not work with generic method.
	 * generally mouse click the middle point of any element on web page.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.src=ym&.intl=us&authMechanism=primary&yid=&done=https%3A%2F%2Fmail.yahoo.com%2F&eid=100&add=1");
		
		//driver.findElement(By.xpath("//input[@id='persistent']")).click(); // with the help of this code check box is not clickable.
		
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id='persistent']"))).click().build().perform();
		
		if(driver.findElement(By.xpath("//input[@id='persistent']")).isSelected())
		{
			System.out.println("Clicked not performed");
		}
		else
		{
			System.out.println("Clicked performed");
		}
	}

}
