package POPUP_WINDOW_OR_BOOTSTRAP;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	/**
	 * @param args
	 * This program handles the multiple window.
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		String parent= driver.getWindowHandle();
		System.out.println("Parent Window ID is: " +parent);
		
		Set<String>allwindows=driver.getWindowHandles();
		
		//First Method
		
		for(String child:allwindows)
		{
			
			if(!child.equalsIgnoreCase(parent)) // Here ID of child window is comparing to parent Windwo
			{
			driver.switchTo().window(child);
			
			System.out.println("Window ID is: "+child);
			System.out.println("Title is: "+driver.getTitle());
			
			driver.close();
			
			Thread.sleep(3000);
			}
		
		}
	
	driver.switchTo().window(parent);
	driver.close();
		
	
		// WE can also use the following code instead of for loop
		/*
		ArrayList<String>tabs= new ArrayList<String>(allwindows);
		System.out.println("=================Tile of Child Window is:================");
		driver.switchTo().window("1");
		System.out.println("Title is: "+driver.getTitle());
		driver.close();
		driver.switchTo().window("2");
		System.out.println("Title is: "+driver.getTitle());
		driver.close();
		driver.switchTo().window("3");
		System.out.println("Title is: "+driver.getTitle());
		driver.close();
*/		
		// Third Method
		/*driver.switchTo().window(tabs.get(1));
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		driver.switchTo().window(tabs.get(3));
		driver.close();
		Thread.sleep(3000);
		
			driver.switchTo().window(tabs.get(0));
		driver.close();
*/		
	}
	
}
