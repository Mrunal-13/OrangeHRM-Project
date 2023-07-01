package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import Pages.AdminPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PIMPage;

public class AddingAdminUserTest extends BaseTest {
	
    @Test
    public void addingAdminUserTest() throws InterruptedException {
    	PIMPage PIMPage = new PIMPage(driver);
    	LoginPage loginPage = new LoginPage(driver);
        AdminPage dashboardPage = new  AdminPage(driver);

        // Login to the application

        loginPage.enterUsername(prop.getProperty("username1"));
		Thread.sleep(3000);
		loginPage.enterPassword(prop.getProperty("password1"));

		loginPage.clickLoginButton();
		Thread.sleep(8000);

        // Navigate to Admin section
		PIMPage.addbtn();
		Thread.sleep(3000);
		PIMPage.addEmployee("Prit", "dilip", "Nimbalkar", "0226");
		Thread.sleep(3000);
        dashboardPage.clickAdminTab();
        dashboardPage.clickUserManagement();

        // Add a new user and make them an admin
        dashboardPage.clickUser();
        dashboardPage.clickAddBtn();
        dashboardPage.enterUserDetails();
        Thread.sleep(3000);
        dashboardPage.clickSaveButton();
        Thread.sleep(2000);

        // Logout as admin
        dashboardPage.clickLogout();
        Thread.sleep(2000);

        // Login with the newly created user
        loginPage.enterUsername("Pritu");
        loginPage.enterPassword("pritu123");
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        
        
        if (Pages.HomePage.isWelcomeMessageDisplayed()) {
			Assert.assertTrue(true, "Invalid credentials message displayed for valid login.");
		} else {
			Assert.assertFalse(true, "Invalid credentials message not displayed for invalid login.");
		}
    }
}
