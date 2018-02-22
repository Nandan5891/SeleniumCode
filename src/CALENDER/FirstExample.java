package CALENDER;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {

	/**
	 * @param args
	 * This program handle the dyanamic date of calender.
	 */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();

		//driver.findElement(By.xpath("//div[@class='rb-calendar']/table[1]")).click();

		List<WebElement> listitem =driver.findElements(By.xpath("//div[@class='rb-calendar']/table[1]//td"));

		int total=listitem.size();

		System.out.println("Size is:"+total);


		for(int i=0;i<total;++i)
		{
			String date=listitem.get(i).getText();
			//System.out.println(date);

			if(date.equals("25"))
			{
				listitem.get(i).click();
				break;
			}

		}
	}

}
