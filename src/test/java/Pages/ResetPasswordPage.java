package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class ResetPasswordPage extends BaseTest{


    public ResetPasswordPage(WebDriver driver) {
        BaseTest.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.xpath(loc.getProperty("ForgotPasswordLink"))).sendKeys(username);
    }

    public void clickResetPasswordButton() {
        driver.findElement(By.className(loc.getProperty("ResetPasswordButtonClass"))).click();
    }

    public String getResetLinkText() {
        return driver.findElement(By.className(loc.getProperty("ResetPasswordSuccessClass"))).getText();
    }
}
