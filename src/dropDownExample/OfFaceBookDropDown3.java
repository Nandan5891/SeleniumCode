package dropDownExample;
import java.util.*;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OfFaceBookDropDown3 {
	public static void main(String []args) 
	{
		System.setProperty("webdriver.gecko.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com/");
		//driver.manage().window().maximize();


		Select DropList= new Select(driver.findElement(By.id("month")));

		List<WebElement> month_list=DropList.getOptions();


		int total_month=month_list.size();

		Assert.assertEquals(total_month, 13); // Validation
		System.out.println("Total Month is:"+total_month);

		for(WebElement ele:month_list)
		{
			String monthname=ele.getText();
			System.out.println("Month name is:--->"+monthname);
		}
	}		

}

