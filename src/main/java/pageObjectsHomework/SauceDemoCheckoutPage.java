package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckoutPage {
    WebDriver driver;
    @FindBy(id = "first-name")
    public WebElement firstNameField;
    @FindBy(id = "last-name")
    public WebElement lastNameField;
    @FindBy(id = "postal-code")
    public WebElement postalCodeField;
    @FindBy(id = "continue")
    public WebElement continueButton;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    public WebElement subtotalLabel;
    @FindBy(xpath = "//div[@class='error-message-container error']")
    public WebElement errorMassage;
    public SauceDemoCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String firstName = "Andris";
    public String lastName = "Paraudziņš";
    public String postalCode = "LV-5113";
    public void fillInCheckoutForm() {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        continueButton.click();
    }
}
