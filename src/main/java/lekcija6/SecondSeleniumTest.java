package lekcija6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondSeleniumTest extends BaseTest {
        private void attemptToLogin(String email,String password){
                WebElement loginEmailInput = driver.findElement(By.id("email"));
                WebElement loginPasswordInput = driver.findElement(By.id("password"));
                WebElement loginButton = driver.findElement(By.className("btn-primary"));

                loginEmailInput.sendKeys(email);
                loginPasswordInput.sendKeys(password);
                loginButton.click();
        }
        @Test
        public void successfulLoginTest() throws InterruptedException {
                driver.get("https://qaproject.acodemy.lv/login");




attemptToLogin("emilysinclair@gmail.com","qwerty123456#");
                WebElement nameDropDown = driver.findElement(By.id("navbarDropdown"));
                Assert.assertEquals(driver.getCurrentUrl(), "https://qaproject.acodemy.lv/home", "User is not navigated to home URL");
                Assert.assertEquals(nameDropDown.getText(), "Emily", "Wrong Name");
        }
                @Test
                public void wrongCredentialsLoginTest() throws InterruptedException {
                        driver.get("https://qaproject.acodemy.lv/login");
                        attemptToLogin("emilysinclir@gmail.com","qwerty1456#");

                        WebElement emailFieldErrorMessage = driver.findElement(By.className("invalid-feedback"));
                        Assert.assertEquals(emailFieldErrorMessage.getText(), "These credentials do not match our records.", "Wrong credentials massege");
                        Thread.sleep(2500);
                }

                @Test
                public void emptyEmailLoginFieldTest(){
attemptToLogin("","nngh65u");
                }
        }


