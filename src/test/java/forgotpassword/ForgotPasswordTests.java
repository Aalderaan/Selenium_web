package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.VerifiedPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail(ForgotPasswordPage.EMAIL);
        VerifiedPage verifiedPage = forgotPasswordPage.retrievePassword();
        Assert.assertTrue(verifiedPage.getVerfiedStatusText().contains("Internal Server Error"));
    }
}

