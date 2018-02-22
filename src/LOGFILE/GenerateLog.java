package LOGFILE;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    Logger log= Logger.getLogger("GenerateLog");
		
		    // configure log4j properties file
	        PropertyConfigurator.configure("log4j.properties");
	 
	        // Open browser
	        System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
	        
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			   
	        log.info("Browser Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        log.info("Implicit wait given");
	      
	 
	        // Load application
	        driver.get("https://www.google.co.in/");
	        log.info("Url opened");
	      
	 
	        // type Selenium
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        log.info("keyword type");           
	    }
		
	}


