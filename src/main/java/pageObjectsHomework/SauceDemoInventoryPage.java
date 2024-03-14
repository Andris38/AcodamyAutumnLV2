package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoInventoryPage {
    WebDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCardBatton;
    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCardLink;
    @FindBy(xpath = "//div[@id='shopping_cart_container']//span")
    public WebElement shoppingCartBadge;

    public SauceDemoInventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
