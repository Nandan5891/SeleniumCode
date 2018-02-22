package BROWSER;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String []args)
	{
		System.setProperty("webdriver.ie.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://www.indeed.co.in/?r=us");
		
		String title=driver.getTitle();
		System.out.println("Title is:" +title);
		
		String source=driver.getPageSource();
		System.out.println("Source is:"+source);
		
		/*
		String txt_table=driver.findElement(By.id("what_Label_top")).getText();
		System.out.println("GetText is:"+txt_table);
		//driver.findElement(By.id("what")).sendKeys("selenium");
		*/
		driver.findElement(By.id("what")).click();
		
		driver.findElement(By.id("what")).click();
		
		
		
	}
}
