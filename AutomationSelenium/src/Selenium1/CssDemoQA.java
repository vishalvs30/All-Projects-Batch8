package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemoQA {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	WebElement fname=driver.findElement(By.cssSelector("div>input[placeholder=\"First Name\"]"));
	fname.sendKeys("Vishal");
	
	WebElement lname=driver.findElement(By.cssSelector("div>input[placeholder=\"Last Name\"]"));
	lname.sendKeys("V S");

	
	driver.findElement(By.id("dateOfBirthInput")).click();
	driver.findElement(By.cssSelector("select>option[value=\"2025\"]")).click();
	driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
	driver.findElement(By.cssSelector("div[aria-label=\"Choose Tuesday, April 1st, 2025\"]")).click();

}
}
