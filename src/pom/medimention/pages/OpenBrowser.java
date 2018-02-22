package pom.medimention.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	static WebDriver driver;

	/*public void geturl(String url)
	{
	driver.get(url);
	driver.findElement(By.linkText("Home")).click();
	WebElement Valid_Login=driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a"));
	Valid_Login.click();
	}*/

	public void open(String browser,String url)
	{

		browser=browser.toLowerCase();

		if(browser.startsWith("c"))
		{
			System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Home")).click();
			WebElement Valid_Login=driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a"));
			Valid_Login.click();
		}
		else if (browser.startsWith("f"))
		{
			System.setProperty("webdriver.gecko.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Home")).click();
			WebElement Valid_Login=driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a"));
			Valid_Login.click();

		}

		else if(browser.startsWith("i"))
		{
			System.setProperty("webdriver.ie.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Home")).click();
			WebElement Valid_Login=driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a"));
			Valid_Login.click();
		}
		LoginPage login= new LoginPage(driver);
		login.usertextbox("Nandan");
		login.passwordtextbox("abcd1234");
		login.submitbutton();
		driver.quit();
	}

}
