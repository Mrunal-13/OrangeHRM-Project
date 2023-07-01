package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BaseTest;

public class HomePage extends BaseTest {

    public HomePage(WebDriver driver) {
        BaseTest.driver = driver;
    }

    public static boolean isWelcomeMessageDisplayed() {
    	WebElement successElement = null;
      try {
          successElement = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
      } catch (NoSuchElementException e) {
          // Element not found, login failed
      }
      if(successElement == null)
      {
    	  return false;
      }
      else {
    	  return true;
      }
    }
    
    public void clickForgotPasswordLink() {
        driver.findElement(By.xpath("//p[normalize-space()='Forgot your password?']")).click();
    }
}

