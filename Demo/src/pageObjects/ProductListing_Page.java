package pageObjects;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
public class ProductListing_Page {

	public WebDriver driver;
	public String baseUrl;
	
	

	
		
		public static WebElement Hair_products(WebDriver driver)
		{
		//	 WebElement element = null;
			 WebElement Hair_Products_menu= driver.findElement(By.linkText("HAIR PRODUCTS"));
			 System.out.println("Test");
			 return Hair_Products_menu;
		 
			 
		}
		public WebElement BestSellers(WebDriver driver)
		{
			WebElement BestSellers_menu=driver.findElement(By.linkText("Best Sellers"));
			return BestSellers_menu;
		}
		
		
		
	
	
	
	
}

