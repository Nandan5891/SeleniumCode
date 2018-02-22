package PRACTICE;


import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExample {
	public static void main(String []args) throws IOException
	{
		//System.setProperty("webdriver.ie.driver", "H:\\SOFTWARE\\IEDriverServer.exe");
		//InternetExplorerDriver driver= new InternetExplorerDriver();
		//System.setProperty("webdriver.gecko.driver", "H:\\SOFTWARE\\geckodriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://indeed.co.in/");
		
		String title= driver.getTitle();
		System.out.println("Title is:"+title);
		//driver.close();
		//driver.quit();
		//driver.manage().window().maximize();
		//Dimension dim= new Dimension(200,600);
		//driver.manage().window().setSize(dim);
		//Point pt= new Point(20,70);
		//driver.manage().window().setPosition(pt);
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	
		//File src= (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("H:/Data/Testing Data/pageerror.png"));
		
		 
		
	}
}
