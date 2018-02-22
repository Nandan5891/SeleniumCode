package PRACTICE;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		
		String parent= driver.getWindowHandle();
		System.out.println("Parent Window ID is:    "+parent);
		
		Set<String>allwindow= driver.getWindowHandles();
		
	/*	for(String child:allwindow)
		{
			if(!child.equalsIgnoreCase(parent))
			{
			driver.switchTo().window(child);
			System.out.println("Title is:  " +driver.getTitle());
			driver.close();
			
			}
			
		}
	*/	
		ArrayList<String>tabs= new ArrayList<String>(allwindow);
		
		driver.switchTo().window(tabs.get(1));
		
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		driver.close();
		driver.switchTo().window(parent);
		
		driver.close();
		
	
	}

}
