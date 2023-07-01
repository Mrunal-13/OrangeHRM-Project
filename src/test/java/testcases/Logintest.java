package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import utilities.ReadXl;


import base.BaseTest;

public class Logintest extends BaseTest {

	@Test(dataProviderClass = ReadXl.class, dataProvider = "testdata")
	public static void LoginTest(String username, String password) throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);

		loginPage.enterUsername(username);
		Thread.sleep(3000);
		loginPage.enterPassword(password);

		loginPage.clickLoginButton();
		Thread.sleep(8000);

		if (HomePage.isWelcomeMessageDisplayed()) {
			Assert.assertTrue(true, "Invalid credentials message displayed for valid login.");
		} else {
			Assert.assertFalse(true, "Invalid credentials message not displayed for invalid login.");
		}
	}

}
