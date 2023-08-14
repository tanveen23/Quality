package Quality_Page_Actions;

import Quality_Page_Locator.Quality_Homepage_Locator;
import Quality_Utility_Page.Quality_Base;

public class Quality_Homepage_Actions extends Quality_Base {
	
	Quality_Homepage_Locator quality_Homepage_Locator = new Quality_Homepage_Locator();
	public void Clicksignuplink()
	
	{
		quality_Homepage_Locator.click_Signup_link.click();
		
		
	}
	public void clickLoginLink()
	{
		
		quality_Homepage_Locator.click_Login_link.click();
	}
	public void ClickSamsungGalaxyS6() {
		quality_Homepage_Locator.samsung_glaxys6_phone.click(); 
	}

}
