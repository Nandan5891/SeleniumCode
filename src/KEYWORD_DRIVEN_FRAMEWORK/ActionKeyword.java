package KEYWORD_DRIVEN_FRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {

	static WebDriver driver;
	public static void operation()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
public static void navigate()
{
	driver.navigate().to("http://www.google.com");
}

public static void click_DF()
{
	driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
}
	
}
