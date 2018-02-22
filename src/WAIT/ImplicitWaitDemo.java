package WAIT;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWaitDemo {

	/**
	 * @param args
	 * Implicit wait used with whole page till element is loaded. Within time frame if element is not getting loaded
	 * then it throws exception.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		long t1= System.currentTimeMillis(); // it return millisecond from 1 Jan 1970 Midnight
		
		driver.get("https://www.naukri.com/");
		
		long t2=System.currentTimeMillis();
		
		double timetaken=(t2-t1)/1000; // Convert into Seconds.
		
		System.out.println("Execution Time taken is: "+timetaken);
		
		driver.quit();
		
		
	}

}
