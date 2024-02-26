package lekcija6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest extends BaseTest{

    @Test
    public void myFirstSeleniumTest() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("http://www.google.lv/");
        Thread.sleep(5000);

    }
    @Test
    public void checkPageTitleTest() {
        driver = new ChromeDriver();
        driver.get("https://acodemy.lv/lv");
        Assert.assertEquals(driver.getTitle(),"IT kursi Latvijā", "Nepareizs Title");
}
    @Test
    public void checkPageUrlTest(){
        driver.get("https://acodemy.lv/lv");
        Assert.assertEquals(driver.getCurrentUrl(),"https://acdemy.lv/lv","WRONG");

}
}

