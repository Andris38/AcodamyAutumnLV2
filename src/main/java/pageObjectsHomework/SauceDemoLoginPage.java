package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {
    WebDriver driver;

    @FindBy(id = "user-name")
    public WebElement userNameField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "login-button")
    public WebElement loginBatton;

    public SauceDemoLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    String userName = "standard_user";
    String password = "secret_sauce";

    public void fillInLoginForm(){
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginBatton.click();
    }
}
