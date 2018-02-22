package PARAMETER_IN_XML;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {
	

	@Test
	@Parameters({"id","password"})
	
	public void Valid_login(String username, String pass)
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://medimention.com/");
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Home")).click();
		
		WebElement Valid_Login=driver.findElement(By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a"));
		Valid_Login.click();
	
		String expected_title="Login Here !!";
		String actual_title=driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	
		System.out.println("Title is:"  +actual_title );
		
		driver.findElement(By.id("UserUsername")).sendKeys(username);
		driver.findElement(By.id("UserPassword")).sendKeys(pass);
		driver.findElement(By.id("UserRememberMe")).click();
		driver.findElement(By.xpath("//*[@id='UserLoginForm']/fieldset/div[2]/button/span")).click();
		System.out.println("Successful Login");
		driver.close();
		
	}
}

