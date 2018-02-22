package HIDDEN_ELEMENT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_HIdden_Element2 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement>radio=driver.findElements(By.id("male"));

		int totalradio=radio.size();
		System.out.println(totalradio);
		for(int i=0;i<totalradio;++i)
		{
			int x=radio.get(i).getLocation().getX();  // Find the co-ordinate of x of radio button.

			if(x!=0)
			{
				radio.get(i).click();
				break;
			}

		}

	}
}


