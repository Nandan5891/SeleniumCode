package TestNG_TUTORIALS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// test case 2 and test case 3 will be skipped as it depends on each other and test case 1 will be failed

public class Dependency2RealExample {
	WebDriver driver;
	
	@BeforeClass
	public void loadBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("==================BROWSER STARTED===================");
	}
	

	@Test
	public void startApp()
	{
		driver.get("http://professional.demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("auth/login")); // Validating the URL
		
		System.out.println("Applicatioin is loaded");
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.sendKeys("admin");
	WebElement LoginButton= driver.findElement(By.id("btnLogin"));
	LoginButton.click();
	
	boolean status=driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).isDisplayed();
	Assert.assertTrue(status); // Validate the admin button is available or not after login 
	
	System.out.println("Logged Successfully");
	}
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() throws Exception
	{
	WebElement AdminButton=driver.findElement(By.xpath("//*[@id='welcome']"));
	AdminButton.click();
	
	Thread.sleep(5000);
	
	WebElement Logout=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a"));
	Logout.click();
	
	driver.findElement(By.id("txtUsername")).isDisplayed(); // Validate after logout login username is displayed or not
	System.out.println("Logout Successfully");
	
	}
	
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
	System.out.println("==============BROWSER CLOSED=====================");
	}

}
