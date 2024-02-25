package lekcija6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAProjectHomePage {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='card-header']")
    public WebElement registerFormHeaderSection;
    @FindBy(xpath=" //div[@class='card-header' and text()='Dashboard']/following-sibling::div[@class='card-body']")
    public WebElement welcomeMessage;
    @FindBy(id="navbarDropdown")
    public WebElement menuDropDown;
    public QAProjectHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
