package Jenkins_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class NewTest {

	WebDriver driver;
	@Test
	public void eBay() {
		driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/");
		
	}
	
}
