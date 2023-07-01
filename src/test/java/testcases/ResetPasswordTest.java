package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import Pages.HomePage;
import Pages.ResetPasswordPage;

public class ResetPasswordTest extends BaseTest {
    @Test
    public void resetPasswordTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage(driver);

        homePage.clickForgotPasswordLink();
        Thread.sleep(2000);

        resetPasswordPage.enterUsername(prop.getProperty("username1"));
        Thread.sleep(2000);

        resetPasswordPage.clickResetPasswordButton();
        Thread.sleep(2000);

        String resetLinkText = resetPasswordPage.getResetLinkText();
        if (resetLinkText.equals("Reset Password link sent successfully")) {
            Assert.assertTrue(true, "Password reset link is generated and received.");
        } else {
            Assert.assertFalse(true, "Password reset link is not generated or received.");
        }
    }
}
