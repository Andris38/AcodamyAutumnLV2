package lekcija6;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectTests extends QAProjectBaseTest{
    @Test
    public void checkAllElementsOnLandingPageTest() {
        QAProjectLandingPage qaProjectLandingPage = new QAProjectLandingPage(driver);
        Assert.assertEquals(qaProjectLandingPage.checkIfElementExistOnPage(),true);
    }
    @Test
    public void testSuccessfulRegistration() throws InterruptedException {
        Faker faker = new Faker();
        QAProjectLandingPage qaProjectLandingPage = new QAProjectLandingPage(driver);
        qaProjectLandingPage.registerLink.click();
        String emailAdress = faker.internet().emailAddress();
        QAProjectRegisterPage qaProjectRegisterPage = new QAProjectRegisterPage(driver);
        qaProjectRegisterPage.fillInRegisterForm("Andris","Avotiņš",emailAdress, emailAdress,"01/26/1990","parole123", "parole123",true);
        String name = "Andris";
        String lastName = "Avotiņš";
        QAProjectHomePage qaProjectHomePage = new QAProjectHomePage(driver);
        Assert.assertEquals(qaProjectHomePage.menuDropDown.getText(),name);
        Assert.assertEquals(qaProjectHomePage.welcomeMessage.getText(),"Welcome, "+lastName+"! You are logged in!");
Thread.sleep(5000);
    }
}

