package POMDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class pageClass {
    WebDriver driver;
    Actions actions;

    // Constructor
    public pageClass(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Locators
    
    By username = By.id("userid");
    By continueBtn = By.id("signin-continue-btn");
    By password = By.id("pass");
    By loginBtn = By.id("sgnBt");
    By searchBox = By.id("gh-ac");
    By addToCartBtn = By.id("atcBtn_btn_1");
    By cartIcon = By.className("gh-cart__icon");
    By removeCartItem = By.cssSelector("button[data-test-id='cart-remove-item']");
    By accountSettings = By.partialLinkText("Account settings");
    By userNameChange = By.id("username");
    By saveBtn = By.id("save");
    By categoryDropdown = By.cssSelector("#gh-cat");
    By allCategories = By.className("gh-categories__title");
    By productImage = By.xpath("//div[@class='s-item__image']/img");
    By countryBtn = By.cssSelector("button[class='gf-flag__button']");

    // Methods
    public void login() {
        
        driver.findElement(username).click();
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys("vishalvswami7@gmail.com");
        driver.findElement(continueBtn).click();
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("Ebay@140825");
        driver.findElement(loginBtn).click();
    }

    public void searchItem(String item) {
        WebElement search = driver.findElement(searchBox);
        search.clear();
        search.sendKeys(item, Keys.ENTER);
    }

    public void addToCart(String productUrl) {
        driver.get(productUrl);
        driver.findElement(addToCartBtn).click();
    }

    public void deleteFromCart() {
        driver.get("https://cart.ebay.com/");
        driver.findElement(cartIcon).click();
        driver.findElement(removeCartItem).click();
    }

    public void changeLoginName(String newName) {
        driver.findElement(By.id("gh-ug")).click();
        driver.findElement(accountSettings).click();
        driver.findElement(userNameChange).clear();
        driver.findElement(userNameChange).sendKeys(newName);
        driver.findElement(saveBtn).click();
    }

    public void shopByCategory(String categoryValue) {
        driver.findElement(categoryDropdown).click();
        driver.findElement(By.cssSelector("#gh-cat option[value='" + categoryValue + "']")).click();
        driver.findElement(By.id("gh-search-btn")).click();
    }

    public void shopByAllCategories() {
        driver.findElement(allCategories).click();
        driver.findElement(By.className("gh-categories__col")).click();
    }

    public void rightClickOnProduct(String keyword) {
        searchItem(keyword);
        WebElement product = driver.findElement(productImage);
        actions.contextClick(product).perform();
    }

    public void changeLanguage() {
        driver.findElement(countryBtn).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("China")).click();
    }
}
