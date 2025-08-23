package ReadExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium_dev {
	
	WebDriver driver;
	boolean stopExecution=true;
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
	}
	
  @Test
  public void title() {
//	  if(stopExecution) {
//		 throw new SkipException("Skipping test"); 
//	  }
	  String expectedtitle="Selenium";
	  String actualtitle=driver.getTitle();
	  boolean result=actualtitle.equals(expectedtitle);
	  Assert.assertEquals(actualtitle, expectedtitle,"Title Validation failed");
	  System.out.println("Expected Title:"+expectedtitle);
	  System.out.println("Actual Title:"+actualtitle);
	  //Assert.fail("Failing title");
	  if(result==false) {
		  Assert.fail("Failing title");
	  }else {
		  System.out.println("Title Validated sucessfully");
	  }
  }
}
