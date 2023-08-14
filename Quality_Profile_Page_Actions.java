package Quality_Page_Actions;


import static org.testng.Assert.assertTrue;

import Quality_Page_Locator.Quality_Profile_Page_Locator;
import Quality_Utility_Page.Quality_Base;
import Quality_Utility_Page.Quality_Utility;

public class Quality_Profile_Page_Actions extends Quality_Base{
	
	Quality_Profile_Page_Locator quality_Profile_Page_Locator = new Quality_Profile_Page_Locator();
	
	public void verifyusercanloginwithvalidcredentials() throws Exception {
		
		
		Thread.sleep(5000);
		boolean loginverify = quality_Profile_Page_Locator.profileverification.isDisplayed();
		assertTrue(loginverify);
		Thread.sleep(5000);
		Quality_Utility.takeMyScreenshot(driver, "Profile Page");
	}

}
