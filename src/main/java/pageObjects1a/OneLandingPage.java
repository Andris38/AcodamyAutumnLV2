package pageObjects1a;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OneLandingPage {
        WebDriver driver;
//@FindBy(id = "cookiebanner");
public  WebElement cookieBanner;
        public OneLandingPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
//        public void switchLanguage(String language){
//            driver.findElement(By.xpath("//li[contains(@class,'language-switcher')]/a[text()='"+ language+"']")).click();))
//        }
    }
