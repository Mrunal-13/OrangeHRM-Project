package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest {

    public LoginPage(WebDriver driver) {
        BaseTest.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.name(loc.getProperty("username"))).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.name(loc.getProperty("password"))).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.className(loc.getProperty("loginbutton"))).click();
    }
    
    public boolean isInvalidCredentialsMessageDisplayed() {
        return driver.findElement(By.xpath("//p[normalize-space()='Invalid credentials']")).isDisplayed();
    }
}
