/**
 * 
 */
package pom.medimention.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ram Nandan Thakur
 *
 *this class will stores all the locators and methods of login page
 *
 */

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.id("UserUsername");
	By Password=By.id("UserPassword");
	By submit_button=By.xpath("//*[@id='UserLoginForm']/fieldset/div[2]/button/span");

	public void usertextbox(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}

	public void passwordtextbox(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
	}

	public void submitbutton()
	{
		driver.findElement(submit_button).click();
	}
}
