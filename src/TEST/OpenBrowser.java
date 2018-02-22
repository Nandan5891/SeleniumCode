package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().window().maximize();


	}
	public void navigate()
	{
		driver.get("https://www.medimention.com/");

	}
	public void Click_Home()
	{
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[1]/a")).click();
	}

public void Click_Login()
{
driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a")).click();	
}
public void TextBoxEnter()
{
	
}
}
