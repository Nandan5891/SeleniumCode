/**
 * 
 */
package pom.medimention.pages;

import org.testng.annotations.Test;

/**
 * @author Ram Nandan Thakur
 *
 */

public class VerifyLoginPage {

	@Test
	public void verifylogin()
	{
		OpenBrowser br= new OpenBrowser();
		br.open("chrome","http://medimention.com/");
		//br.geturl("http://medimention.com/");	
	}
}
