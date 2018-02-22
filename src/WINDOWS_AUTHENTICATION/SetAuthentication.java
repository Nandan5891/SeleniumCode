package WINDOWS_AUTHENTICATION;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetAuthentication {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		
		//WebDriver driver= new ChromeDriver();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.engprod-charter.net/");
		
		Runtime.getRuntime().exec("C:\\Users\\Ram Nandan Thakur\\Desktop\\AUTOIT\\WinAuthenticate.exe");
		
		
		
		
	}

}
