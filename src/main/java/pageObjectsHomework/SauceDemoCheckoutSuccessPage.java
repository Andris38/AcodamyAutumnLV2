package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckoutSuccessPage {
    WebDriver driver;

@FindBy(xpath = "//h2[@class='complete-header']")
public WebElement successMassage;
@FindBy(id = "back-to-products")
public WebElement backHomeButton;
    public SauceDemoCheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
