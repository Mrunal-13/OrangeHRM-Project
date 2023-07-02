package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;
import Pages.Punching;
public class PunchingTest extends BaseTest {
	
	@Test
	 public void punchingtest() throws InterruptedException {
		
		//code to login
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername(prop.getProperty("username1"));
		Thread.sleep(1000);
		loginPage.enterPassword(prop.getProperty("password1"));

		loginPage.clickLoginButton();
		Thread.sleep(2000);
		
		
		//code to click dashboard and clock then punch
		
		Punching p = new Punching(driver);
		p.visitdashboard();
		p.clickclock();
		p.punchcheck();
		
		
		
	 }

}
