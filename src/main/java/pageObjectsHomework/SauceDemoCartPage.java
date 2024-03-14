package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCartPage {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='cart_quantity']")
    public WebElement quantityCard;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']")
    public WebElement productName;
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    public SauceDemoCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
