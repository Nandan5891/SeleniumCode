package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com/");
		//driver.manage().window().maximize();
		
		WebElement MonthDropDown= driver.findElement(By.id("month"));
		
		Select DropList= new Select(MonthDropDown);
		
		DropList.selectByIndex(3); // it will select March 
		
		Thread.sleep(4000);
		
		DropList.selectByValue("10"); // It will select Oct
		
		Thread.sleep(4000);
		
		DropList.selectByVisibleText("Jul"); // it will select Jul
		
		
		
		
		
		
	}
}
