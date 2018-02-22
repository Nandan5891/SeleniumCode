package BROKEN_LINK;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLink {

	/**
	 * @param args
	 * @throws Exception 
	 * This program check the all link available on facebook and it also check all links are proper working or broken.
	 */

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://facebook.com");

		List<WebElement>link=driver.findElements(By.tagName("a"));

		int total_link=link.size();

		System.out.println("No of Total Link is:  "+total_link);

		for(int i=0;i<total_link;++i)
		{
			String url=link.get(i).getAttribute("href");

			//System.out.println("Name of link is: "+url);

			verifylink(url);
		}

	}

	public static void verifylink(String linkurl) 
	{
		try
		{
			URL url= new URL(linkurl);

			HttpURLConnection connection= (HttpURLConnection)url.openConnection();

			connection.setConnectTimeout(4000);

			connection.connect();

			if(connection.getResponseCode()==200)
			{
				System.out.println(linkurl+ "         " + connection.getResponseMessage());
			}

			if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{

				System.out.println(linkurl + " "+ connection.getResponseMessage() + "  -   " + HttpURLConnection.HTTP_NOT_FOUND);	
			}

		}

		catch(Exception e)
		{
			System.out.println("Exception is:  "+e.getMessage());
		}

	}

}
