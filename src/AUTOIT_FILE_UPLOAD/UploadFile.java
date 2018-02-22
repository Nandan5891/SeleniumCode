package AUTOIT_FILE_UPLOAD;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	@Test
	public void upload() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Ram%20Nandan%20Thakur/Desktop/fileupload.html");
		
		driver.findElement(By.xpath("//*[@id='1']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Ram Nandan Thakur\\Desktop\\AUTOIT\\Fileupload.exe");
		
		driver.quit();
		
		}
	}
