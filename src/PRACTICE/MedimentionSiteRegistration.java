package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedimentionSiteRegistration {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://medimention.com/");
		String title= driver.getTitle();
		System.out.println("Title is:" +title);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Home")).click();
		//driver.findElement(By.linkText("Doctor")).click();
		driver.findElement(By.linkText("Join Us")).click();
		
		
		
		//boolean chk1,chk2;
		//chk1=driver.findElement(By.id("UserRole")).isEnabled();
		//System.out.println("Chk1 value is:"+chk1);
		//chk1=driver.findElement(By.xpath("//*[@id="UserAddForm"]/fieldset/label[1]/span/div/div/button/span[1]")); 
		//System.out.println("Value of Chk1 is:"+chk1);
	    //chk2=driver.findElement(By.id("UserRole")).isEnabled();
		//System.out.println("Displayed Value is:"+chk2);
		
		
		
		driver.findElement(By.id("DetailName")).sendKeys("RamNandan");
		driver.findElement(By.id("UserUsername")).sendKeys("Testing");
		driver.findElement(By.id("UserEmail")).sendKeys("nandan@yahoo.com");
		driver.findElement(By.id("UserPassword")).sendKeys("abcd4321");
		driver.findElement(By.id("UserPassword1")).sendKeys("abcd4321");
		
		
		
		WebElement CheckBox=driver.findElement(By.xpath("//*[@id=\"UserAddForm\"]/fieldset/label[7]/input"));
		boolean b;
		b=CheckBox.isSelected();
		System.out.println("Value is:"+b);
		CheckBox.click();
	
		
		 
	}
}
 