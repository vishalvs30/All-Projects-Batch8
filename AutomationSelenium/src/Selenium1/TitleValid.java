package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValid {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\swami\\Downloads\\Automation files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.selenium.dev/");
    System.out.println("page loaded successfully"); 
    
	String exceptedtitle="Selenium dev";
	String actualtitle=driver.getTitle();
	
	System.out.println("Excepted Title: "+exceptedtitle);
	System.out.println("Actual Title: "+actualtitle);

	
//	driver.manage().window().maximize();
//	Thread.sleep(3000);
//	if(exceptedtitle.equals(actualtitle)) {
//		System.out.println("Title validation successful");
//	}else {
//		System.out.println("Title validation Failed");
//	}
	
	
	driver.close();
}
}
