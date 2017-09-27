 package automationFramework;
 
 import java.util.concurrent.TimeUnit;
 
import org.junit.Test;
//import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
 
     import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ProductListing_Page;

// Import package pageObject.*
 

//import pageObjects.ProductListing_Page.*;
//import pageObjects.ProductListing_Page.Product_1;
 
//Added to version Control

public class Main_menu {
 
     private static WebDriver driver = null;
     
     @Test
     
     public  void test1() throws Exception {
 
     driver = new FirefoxDriver();
 
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
     driver.get("https://www.carolsdaughter.com/");
     driver.manage().window().maximize();
   
     ProductListing_Page objprod=new ProductListing_Page();
     // Use page Object library now
 
     //  objprod.Hair_products(driver).click();
     ProductListing_Page.Hair_products(driver).click();
     
     Thread.sleep(10000);
     objprod.BestSellers(driver).click();
     objprod.Skincare(driver).click();
     Thread.sleep(100);
      
     //     driver.quit();
     
     
 
     }
}
 