package seleniumHomework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

public class SauceDemoTests extends SauceDemoBaseTest {
    @Test
    public void userLoginTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver);
        sauceDemoLoginPage.fillInLoginForm();
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
    }

    @Test
    public void TestUserBuyProduct() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver);
        sauceDemoLoginPage.fillInLoginForm();
        SauceDemoInventoryPage sauceDemoInventoryPage = new SauceDemoInventoryPage(driver);
        sauceDemoInventoryPage.addToCardBatton.click();
        Assert.assertTrue(sauceDemoInventoryPage.shoppingCartBadge.isDisplayed(), "Badge is displayed");
        sauceDemoInventoryPage.shoppingCardLink.click();
        SauceDemoCartPage sauceDemoCartPage = new SauceDemoCartPage(driver);
        Assert.assertEquals(sauceDemoCartPage.quantityCard.getText(), "1", "OK");
        Assert.assertEquals(sauceDemoCartPage.productName.getText(), "Sauce Labs Backpack", "OK");
        sauceDemoCartPage.checkoutButton.click();
        SauceDemoCheckoutPage sauceDemoCheckoutPage = new SauceDemoCheckoutPage(driver);
        sauceDemoCheckoutPage.fillInCheckoutForm();
        SauceDemoCheckoutOverviewPage sauceDemoCheckoutOverviewPage = new SauceDemoCheckoutOverviewPage(driver);
        Assert.assertEquals(sauceDemoCheckoutOverviewPage.totalLabel.getText(), "Total: $32.39", "Price is correct");
        sauceDemoCheckoutOverviewPage.finishButton.click();
        SauceDemoCheckoutSuccessPage sauceDemoCheckoutSuccessPage = new SauceDemoCheckoutSuccessPage(driver);
        Assert.assertEquals(sauceDemoCheckoutSuccessPage.successMassage.getText(), "Thank you for your order!");
        sauceDemoCheckoutSuccessPage.backHomeButton.click();
    }

    public void goToCheckoutPage() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver);
        sauceDemoLoginPage.fillInLoginForm();
        SauceDemoInventoryPage sauceDemoInventoryPage = new SauceDemoInventoryPage(driver);
        sauceDemoInventoryPage.shoppingCardLink.click();
        SauceDemoCartPage sauceDemoCartPage = new SauceDemoCartPage(driver);
        sauceDemoCartPage.checkoutButton.click();
    }
        @Test
        public void Test1CorrectCheckoutErrorMassage() {
        goToCheckoutPage();
        SauceDemoCheckoutPage sauceDemoCheckoutPage = new SauceDemoCheckoutPage(driver);
        sauceDemoCheckoutPage.lastNameField.sendKeys(sauceDemoCheckoutPage.lastName);
        sauceDemoCheckoutPage.postalCodeField.sendKeys(sauceDemoCheckoutPage.postalCode);
        sauceDemoCheckoutPage.continueButton.click();
        Assert.assertEquals(sauceDemoCheckoutPage.errorMassage.getText(), "Error: First Name is required");
    }
        @Test
        public void Test2CorrectCheckoutErrorMassage() {
        goToCheckoutPage();
        SauceDemoCheckoutPage sauceDemoCheckoutPage = new SauceDemoCheckoutPage(driver);
        sauceDemoCheckoutPage.firstNameField.sendKeys(sauceDemoCheckoutPage.firstName);
        sauceDemoCheckoutPage.postalCodeField.sendKeys(sauceDemoCheckoutPage.postalCode);
        sauceDemoCheckoutPage.continueButton.click();
        Assert.assertEquals(sauceDemoCheckoutPage.errorMassage.getText(), "Error: Last Name is required");
            }
    @Test
    public void Test3CorrectCheckoutErrorMassage() {
        goToCheckoutPage();
        SauceDemoCheckoutPage sauceDemoCheckoutPage = new SauceDemoCheckoutPage(driver);
        sauceDemoCheckoutPage.firstNameField.sendKeys(sauceDemoCheckoutPage.firstName);
        sauceDemoCheckoutPage.lastNameField.sendKeys(sauceDemoCheckoutPage.lastName);
        sauceDemoCheckoutPage.continueButton.click();
        Assert.assertEquals(sauceDemoCheckoutPage.errorMassage.getText(), "Error: Postal Code is required");
    }
        }



