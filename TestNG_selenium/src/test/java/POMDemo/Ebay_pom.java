package POMDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Ebay_pom {
    WebDriver driver;
    pageClass page;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
        page = new pageClass(driver);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
    	driver.findElement(By.linkText("Sign in")).click();
        page.login();
        
       // Assert.assertTrue(driver.getTitle().contains("My eBay"), "Login failed!");
    }

    @Test(priority = 2)
    public void multipleSearchesTest() throws InterruptedException {
        List<String> items = new ArrayList<>();
        items.add("Laptop");
        items.add("Shoes");
        items.add("Watches");

        for (String item : items) {
            page.searchItem(item);
            Thread.sleep(2000);
            Assert.assertTrue(driver.getTitle().toLowerCase().contains(item.toLowerCase()), "Search failed for " + item);
            driver.navigate().back();
        }
    }

    @Test(priority = 3)
    public void addToCartTest() throws InterruptedException {
        page.addToCart("https://www.ebay.com/itm/177334525191");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void deleteFromCartTest() throws InterruptedException {
        page.deleteFromCart();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void changeLoginNameTest() {
        page.changeLoginName("NewUsername");
    }

    @Test(priority = 6)
    public void shopByCategoriesTest() throws InterruptedException {
        page.shopByCategory("267");
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void shopByAllCategoriesTest() throws InterruptedException {
        page.shopByAllCategories();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void rightClickDescriptionTest() throws InterruptedException {
        page.rightClickOnProduct("Nikon Camera");
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void languageChangeTest() throws InterruptedException {
        page.changeLanguage();
        Thread.sleep(2000);
    }
}
