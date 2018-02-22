package HIGHLIGHTER;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

	/**
	 * @param args
	 */
	public static void highlightelement(WebDriver driver, WebElement element) {

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:pink; border:2px solid red;');",element);

		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','background:pink; border:2px solid red;');",element);
	}

}
