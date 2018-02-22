package CORDINATE_OF_LINK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIN {
	
@Test
public void xycordinate()
{
	System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=GqsOWpHxHeny8AfNqYeoBw");
	
	WebElement SignIN= driver.findElement(By.id("gb_70"));

	
	int x=SignIN.getLocation().getX();
	int y=SignIN.getLocation().getY();
	
	System.out.println("X cordinate is: -->"+x);
	System.out.println("Y cordinate is: -->"+y);
	
	// if any link which have (0,0)coordinates it is not clickable	
	}

}
