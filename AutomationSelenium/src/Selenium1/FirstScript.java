package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
public static void main(String[] args)throws InterruptedException {
	System.out.println("this is the first Automation script");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\swami\\Downloads\\Automation files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.selenium.dev/");
    
	String exceptedUrl="https://www.selenium.dev/";
	String actualUrl=driver.getCurrentUrl();
	
	System.out.println("Excepted Url: "+exceptedUrl);
	System.out.println("Actual Url: "+actualUrl);

	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	if(exceptedUrl.equals(actualUrl)) {
		System.out.println("Url validation successful");
	}else {
		System.out.println("Url validation Failed");
	}
	driver.close();
	System.out.println("page load successfully");
	}
	
}

