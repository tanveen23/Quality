package Quality_Page_Actions;

import Quality_Page_Locator.Quality_Product_Page_Locator;
import Quality_Utility_Page.Quality_Base;

public class Quality_Product_Page_Actions extends Quality_Base{
	Quality_Product_Page_Locator quality_Product_Page_Locator = new Quality_Product_Page_Locator();
	public void ClickaddtoCart() {;
	quality_Product_Page_Locator.Q_add_to_cart.click();
	}
	public void ClickCartLink() throws Exception {
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		quality_Product_Page_Locator.Q_cart_link.click();
		
		
	}
}
