package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;
import Pages.Buzz;
import Pages.HomePage;

public class BuzzTest extends BaseTest{
	@Test
	 public void buzztest() throws InterruptedException {
		
		//code to login
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername(prop.getProperty("username1"));
		Thread.sleep(1000);
		loginPage.enterPassword(prop.getProperty("password1"));

		loginPage.clickLoginButton();
		Thread.sleep(2000);
		
		//click buzz nd set post
		
		Buzz b =  new Buzz(driver);
		
		b.buzzsidebar();
		b.addpost();
		b.postbtn();
		Thread.sleep(3000);
		
		if (b.checkUpload()) {
			Assert.assertTrue(true, "post uploaded");
		} else {
			Assert.assertFalse(true, "post not found");
		}
		
		
	}
}
