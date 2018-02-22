package SIKULI;

import java.util.regex.Pattern;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;
import com.relevantcodes.extentreports.ExtentReports;

public class GmailLogin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		
		//WebDriver driver= new ChromeDriver();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.getCurrentUrl();
	}
}
