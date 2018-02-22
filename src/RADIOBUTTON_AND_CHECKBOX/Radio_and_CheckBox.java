package RADIOBUTTON_AND_CHECKBOX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_and_CheckBox {
		public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(WebElement ele:radio)
		{
		String value=ele.getAttribute("value");	
		System.out.println("Value is:"+value);
		
		if(value.equalsIgnoreCase("RUBY"))
			{
			ele.click();	
			}
		}
		
	List<WebElement> Check_Box=driver.findElements(By.xpath("//*[@type='checkbox']"));
	
	for(WebElement ele:Check_Box)
		{
		String value2=ele.getAttribute("id");
		System.out.println("Values of CheckBoxes are: =======>"+value2);
		
		if(value2.equalsIgnoreCase("SING"))
		{
		ele.click();
		}
	   }	
	}
}
