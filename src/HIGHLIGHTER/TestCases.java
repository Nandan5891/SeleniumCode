package HIGHLIGHTER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ram@yahoo.com");
		Helper.highlightelement(driver, email);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("abcd1234");
		Helper.highlightelement(driver, password);
		
		
		WebElement button=driver.findElement(By.id("u_0_5"));
		button.click();
		Helper.highlightelement(driver, button);

	}

}
