package PAGE_FACTORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page 
{

	static WebDriver driver;

	@FindBy(how=How.ID,using="email")
	static WebElement txt_username;


	@FindBy(how=How.ID,using ="pass")
	static WebElement txt_pass;

	@FindBy(how=How.XPATH,using="//input[@id='u_0_2']")
	static WebElement btn_submit;


	public void LoginAction(String uname, String pass)
	{
		txt_username.sendKeys("uname");
		txt_pass.sendKeys(pass);
		btn_submit.click();
	}
	
}


