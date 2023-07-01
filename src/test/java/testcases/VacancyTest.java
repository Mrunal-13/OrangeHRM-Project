package testcases;

import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.LoginPage;
import Pages.PIMPage;
import base.BaseTest;
import Pages.RecruitmentPage;
import Pages.VacancyForm;

public class VacancyTest extends BaseTest{
	 @Test
	    public void vacancytest() throws InterruptedException {
	        RecruitmentPage r = new RecruitmentPage(driver);
	    	LoginPage loginPage = new LoginPage(driver);

	        VacancyForm v =  new VacancyForm(driver);

	        // Login to the application

	        loginPage.enterUsername(prop.getProperty("username1"));
			Thread.sleep(1000);
			loginPage.enterPassword(prop.getProperty("password1"));

			loginPage.clickLoginButton();
			Thread.sleep(2000);
			
			//click on rcruiment
			r.clickRecruitmentTab();
			Thread.sleep(2000);
			r.clickVacanciesTab();
			Thread.sleep(2000);
			r.AddbtnVacancy();
			Thread.sleep(3000);
			
			//fillformvacancy
			v.fillform();
			v.savebtn();
			
			
	 }
}
