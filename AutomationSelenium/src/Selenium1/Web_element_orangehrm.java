package Selenium1;



import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_orangehrm {

    public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException {
        System.out.println("Manual test --> " + testexecution);

        // Locate username field
        Thread.sleep(2000);
        WebElement user = driver.findElement(By.name("username"));
        user.clear();
        user.sendKeys(user1);

        // Locate password field
        WebElement pass = driver.findElement(By.name("password"));
        pass.clear();
        pass.sendKeys(pass1);

        // Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.findElement(By.className("orangehrm-login-button")).click();
        Thread.sleep(3000);
        
        //navigate back to login page for next test data
        //driver.navigate().refresh();
        //Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // List of credentials
        List<String[]> credentials = new ArrayList<>();
        credentials.add(new String[]{"wrongUser1", "wrongPass1", "Invalid login"});
        credentials.add(new String[]{"Admin", "wrongPass", "Invalid login"});
        credentials.add(new String[]{"wrongUser2", "admin123", "Invalid login"});
        credentials.add(new String[]{"Admin", "admin123", "Login successful"});

        for (String[] cred : credentials) {
            loginStep(driver, cred[0], cred[1], cred[2]);

            // Navigate back to login page if not logged in
            if (!cred[2].equalsIgnoreCase("Login successful")) {
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            } else {
                System.out.println("Test finished with successful login");
                break; // stop loop after success
            }
        }

        driver.quit();
    }
}

