package Quality_Page_Actions;

import Quality_Page_Locator.Quality_SignIn_Page_Locator;
import Quality_Test_Data_Page.Quality_Test_Data;
import Quality_Utility_Page.Quality_Base;

public class Quality_SignIn_Page_Actions extends Quality_Base {
	
	Quality_SignIn_Page_Locator quality_SignIn_Page_Locator = new Quality_SignIn_Page_Locator();
	
	public void Enter_username_password() throws Exception
	{
		quality_SignIn_Page_Locator.usernamef.sendKeys(Quality_Test_Data.User5);
		Thread.sleep(3000);
		quality_SignIn_Page_Locator.passwordf.sendKeys(Quality_Test_Data.Passoward5);
		
	}
	public void Login_button() throws Exception
	{
		
		quality_SignIn_Page_Locator.click_login_button.click();
		
	}

}
