package HIDDEN_ELEMENT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_HIdden_Element {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://expedia.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@id='primary-header-flight']")).click();
		
		driver.findElement(By.xpath("//select[@id='flight-children']")).click();
		
		Select drop = new Select( driver.findElement(By.xpath("//select[@id='flight-children']")));
		
	
	//	elechild.click();
		
		List<WebElement>list=  drop.getOptions();
		
	int totallist= list.size();
	System.out.println("totalsize is : "+totallist);
	
	for(int i=0;i<totallist;++i)
	   {
		if(list.get(i).getText()=="3")
		{
			list.get(i).isSelected();
			break;
		}
		}
	}
/*
				System.out.println("Total is: "+totallist);
		
		Select group= new Select(driver.findElement(By.xpath("//select[@id='flight-children']")));
		
		group.selectByVisibleText("2");
	*/	
		}
		
	


