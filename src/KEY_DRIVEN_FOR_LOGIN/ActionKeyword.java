package KEY_DRIVEN_FOR_LOGIN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {

	static WebDriver driver;

	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();	
	}

	public static void navigate()
	{
		driver.navigate().to("http://www.medimention.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	public static void Click_Home()
	{
		driver.findElement(By.linkText("Home")).click();
	}

	public static void Click_Login()
	{
		driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a")).click();
	}

	public static void TextBoxEnter()
	{
		driver.findElement(By.id("UserUsername")).sendKeys("Nandan");
		driver.findElement(By.id("UserPassword")).sendKeys("abcd1234");
	}

	public static void Click_Submit()
	{
		driver.findElement(By.xpath("//*[@id='UserLoginForm']/fieldset/div[2]/button")).click();
	}

}
