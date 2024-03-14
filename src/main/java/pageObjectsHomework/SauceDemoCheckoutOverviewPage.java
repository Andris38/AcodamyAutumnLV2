package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckoutOverviewPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    public WebElement totalLabel;
    @FindBy(id = "finish")
    public WebElement finishButton;
    public SauceDemoCheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
