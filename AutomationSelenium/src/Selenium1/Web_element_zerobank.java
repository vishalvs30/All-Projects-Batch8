package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_zerobank {
 
	public static void loginStep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException {
		System.out.println("Manual test-->"+testexecution);
		
		WebElement user=driver.findElement(By.id("user_login"));
		user.sendKeys(user1);
		
		//locating password text field
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.sendKeys(pass1);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		
		System.out.println("Welcome to zero bank login page");
		
		loginStep(driver,"467467324", "36333", "unable to login");
		loginStep(driver, "username", "646678", "Unable to login");
		loginStep(driver, "32477873", "password", "unable to login");
		//loginStep(driver, null, null, "Unable to login");
		loginStep(driver, "username", "password", "login successfull");
	}
}
