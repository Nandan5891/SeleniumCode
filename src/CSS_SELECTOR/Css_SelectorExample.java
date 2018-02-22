package CSS_SELECTOR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_SelectorExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("input#email")).sendKeys("Nandan"); // # is used for ID
		driver.findElement(By.cssSelector("input.inputtext[name='pass']")).sendKeys("abcd123"); //. dot is used for class
		driver.findElement(By.cssSelector("input[id*='2']")).click(); // * is used for contains.
		driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("Krishna"); //^ is used for start with
		driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("Gopal"); // $ is used for end with

		driver.close();
	}
}
