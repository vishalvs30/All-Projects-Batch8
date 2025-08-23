package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_login {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/login.html");
	System.out.println("Welcome to Zero bank Login page");
	
	{
		System.out.println("Manual Test-->check user is unable to login with valid credentails");
	}
	
	//locating username text field
	driver.findElement(By.id("user_login")).click();
	driver.findElement(By.id("user_login")).sendKeys("username");
	
	//locating password text field
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("password");
	
	//click on sigin button
	driver.findElement(By.name("submit")).click();
	System.out.println("Login successfully");
	
	Thread.sleep(3000);
	driver.close();
}
}
