package lekcija6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNavigation extends BaseTest{
    @Test
    public void testBrowserNavigation() throws InterruptedException {
        WebElement smartNetBanner = driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(6000);
    }
    @Test
    public void testAcceptCookiesIn1a() throws InterruptedException {
        driver.get("https//www.1a");
        WebElement acceptAllCookiesButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertEquals(cookieBanner.isDisplayed(), "Cookie banner is not displayed");

        System.out.println(cookieBanner.getTagName());
        Assert.assertEquals(cookieBanner.getCssValue("display"), "block");
        Assert.assertEquals(cookieBanner.getCssValue("display"), "none");

        acceptAllCookiesButton.click();

        Assert.assertFalse(cookieBanner.isDisplayed(), "Cookie banner is displayed");
    }
//        @Test
//         public void testAttributeIn1a(){
//            driver.get("https://www.1a.lv/");
//            OneALandingPage oneALandingPage = new OneALandingPage(driver);
//            cookieBanner = driver.findElement(By.id("cookiebanner"));
//            Assert.assertEquals(cookieBanner.getAttribute("lang"),"lv");
//            oneALandingPage.switchLanguage("RU");
//            Assert.assertEquals(cookieBanner.getAttribute("lang"),"ru");
//            oneALandingPage.switchLanguage("LV");
//            Assert.assertEquals(cookieBanner.getAttribute("lang"),"lv");
//        }
    }

