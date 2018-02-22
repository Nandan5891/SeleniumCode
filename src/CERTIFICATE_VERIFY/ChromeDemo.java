
package CERTIFICATE_VERIFY;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDemo {

	/**
	 * @param args
	 * This program handle uncertify WEbsite
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dsssbonline.nic.in/");	
	}

}
