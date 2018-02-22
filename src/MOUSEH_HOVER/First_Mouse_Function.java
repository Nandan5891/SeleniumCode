package MOUSEH_HOVER;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class First_Mouse_Function {
	
	@Test
	public void mouse_action() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		WebElement element=driver.findElement(By.xpath("//*[@id='header']/div[1]/ul/li[10]/div"));
		
		Thread.sleep(4000);
		
		Actions act= new Actions(driver);
		
		act.moveToElement(element).perform();
				
		List<WebElement> link_item = driver.findElements(By.xpath("//*[@id='header']/div[1]/ul/li[10]/div/div//a"));
		
		int totalLink=link_item.size();
		
		System.out.println("Total link of More button is:" +totalLink);
		
		for(WebElement ele:link_item)
		{
			String text=ele.getText();
			System.out.println(text);
		
			if(text.equalsIgnoreCase("Events"))
			{
			ele.click();
			break;
			}
		}

		/*for(int i=0;i<totalLink;i++)
		{
		 	WebElement Linkname=link_item.get(i);
			String name=Linkname.getText();
			System.out.println(name);
		}*/
	}
		
		
	}

