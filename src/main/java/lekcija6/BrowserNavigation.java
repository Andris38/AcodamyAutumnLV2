package lekcija6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects1a.OneALandingPage;

import java.util.List;

public class BrowserNavigation extends BaseTest{
    @Test
    public void testBrowserNavigation() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        WebElement smartNetBanner = driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();

        List<WebElement> listOnInputFields = driver.findElements(By.className("users-session-form__input--text"));
        for (WebElement listOnInputField : listOnInputFields) {
            listOnInputField.sendKeys("Juris");
        }

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(6000);
    }
//    @Test
//    public void testJavaScriptExecuter() throws InterruptedException {
//        driver.get("https://www.delfi.lv");
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("window.scrollBy(0,600)");
//        Thread.sleep(2000);
//        javascriptExecutor.executeScript("window.scrollBy(0,600)");
//        Thread.sleep(2000);
//        javascriptExecutor.executeScript("window.scrollBy(0,-600)");
//        Thread.sleep(2000);
//        javascriptExecutor.executeScript("window.scrollBy(0,-600)");
//        WebElement cookieAcceptButton = driver.findElement(By.id("cookiescript_accept"));
//        String cookieButtonText = (String) javascriptExecutor.executeScript("return arguments[0].innerHTML",cookieAcceptButton);
//System.out.println(cookieButtonText);
//        javascriptExecutor.executeScript("arguments[0].",cookieAcceptButton);
//        WebElement delfiFooter = driver.findElement(By.className("footer-menu--primary"));
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView()",delfiFooter);
//    }


    @Test
    public void testAcceptCookiesIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        WebElement acceptAllCookiesButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertEquals(cookieBanner.isDisplayed(), true, "Cookie banner is not displayed");
        System.out.println(cookieBanner.getTagName());
        Assert.assertEquals(cookieBanner.getCssValue("display"), "block");
//        Assert.assertEquals(cookieBanner.getCssValue("display"), "none");
        acceptAllCookiesButton.click();
        Assert.assertFalse(cookieBanner.isDisplayed(),"Cookie banner is displayed");
        Thread.sleep(6000);
    }
    @Test
    public void test220cookies(){
        driver.get("https://220.lv/lv/");
        WebElement cookieBlock = driver.findElement(By.id("cookie_block"));
        Assert.assertTrue(cookieBlock.isDisplayed(),"Cookie block is not displayed");
        driver.findElement(By.xpath("//div[@class='cookies_wrapper']//button[@widget-attachpoint='agree']")).click();
        Assert.assertFalse(cookieBlock.isDisplayed(),"Cookie block is displayed");
        List<WebElement> cookieBanners = driver.findElements(By.id("cookiebanner"));
        Assert.assertEquals(cookieBanners.size(),0);

    }
        @Test
         public void testAttributeIn1a(){
            driver.get("https://www.1a.lv/");
            OneALandingPage oneALandingPage = new OneALandingPage(driver);
            List<WebElement> languageElements = driver.findElements(By.xpath("//li[contains(@class,'language-switcher')]/a"));
            Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"), "lv");
            languageElements.get(1).click();
//            oneALandingPage.switchLanguage("RU");
            Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"ru");
            oneALandingPage.switchLanguage("LV");
            Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"lv");
        }
        @Test
    public void testKeyboardsActions() throws InterruptedException {
        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/");
            new Actions(driver)
                    .keyDown(Keys.COMMAND)
                    .sendKeys("K")
                    .perform();
            Thread.sleep(6000);
            new Actions(driver)
                    .sendKeys(Keys.ESCAPE)
                    .perform();
            Thread.sleep(6000);
        }
    }

