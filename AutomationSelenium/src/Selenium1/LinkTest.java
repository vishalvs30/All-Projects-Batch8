package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/results?search_query=cocomelon");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	
	//driver.findElement(By.linkText("Wheels on the Bus | @CoComelon Nursery Rhymes & Kids Songs")).click();
	driver.findElement(By.partialLinkText("Wheels on the Bus")).click();

}
}
