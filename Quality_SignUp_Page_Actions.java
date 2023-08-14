package Quality_Page_Actions;

import Quality_Page_Locator.Quality_SignUp_Page_Locator;
import Quality_Utility_Page.Quality_Base;

public class Quality_SignUp_Page_Actions extends Quality_Base {
	
	Quality_SignUp_Page_Locator quality_SignUp_Page_Locator = new Quality_SignUp_Page_Locator();
	
	public void usernamepassword() throws Exception
	{
		quality_SignUp_Page_Locator.Username.sendKeys("tanveen");
		Thread.sleep(3000);
		quality_SignUp_Page_Locator.password.sendKeys("t12345");
		
	}
	public void signup_button() throws Exception
	{
		
		quality_SignUp_Page_Locator.signup_button.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
}
