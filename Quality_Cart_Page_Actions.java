package Quality_Page_Actions;

import static org.testng.Assert.assertTrue;

import Quality_Page_Locator.Quality_Cart_Page_Locator;
import Quality_Utility_Page.Quality_Base;
import Quality_Utility_Page.Quality_Utility;

public class Quality_Cart_Page_Actions extends Quality_Base{
	Quality_Cart_Page_Locator quality_Cart_Page_Locator = new Quality_Cart_Page_Locator(); 
	public void Verifyusercanadditeminthecartsuccessfully() throws Exception {
		
		
		Thread.sleep(5000);
		boolean cartverification = quality_Cart_Page_Locator.cart_verify.isDisplayed(); 
		assertTrue(cartverification);
		Quality_Utility.takeMyScreenshot(driver, "Cart Page");
	} 
}
