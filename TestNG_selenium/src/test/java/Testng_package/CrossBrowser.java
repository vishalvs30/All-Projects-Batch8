package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	 @Test
	  public void chromebrowser() throws InterruptedException
	  {
		  driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/"); 
		  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String actualtitle=driver.getTitle();
		  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
		  Thread.sleep(3000);
		  
	  }
	 @Test
	  public void edgebrowser() throws InterruptedException
	  {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\swami\\Downloads\\Automation files\\edgedriver_win64\\msedgedriver.exe\\");
		  driver = new EdgeDriver();
		  driver.get("https://www.flipkart.com/"); 
		  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String actualtitle=driver.getTitle();
		  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
		  Thread.sleep(3000);
		  
	  }
}
