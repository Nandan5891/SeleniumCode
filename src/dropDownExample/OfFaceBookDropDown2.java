package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OfFaceBookDropDown2 {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com/");
		//driver.manage().window().maximize();
		
		WebElement MonthDropDown= driver.findElement(By.id("month"));
		Select DropList= new Select(MonthDropDown);
		
		WebElement Selected_Value=DropList.getFirstSelectedOption();
		System.out.println("Before Selection Selected Values is:"+Selected_Value.getText()); // it will give month
		
		DropList.selectByIndex(3); // it will select March
		
		WebElement Selected_Value1=DropList.getFirstSelectedOption();
		System.out.println("After Selection Selected Value is:"+Selected_Value1.getText());
		
	}
}
