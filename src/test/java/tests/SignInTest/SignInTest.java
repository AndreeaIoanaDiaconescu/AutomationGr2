package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {

        String email = "grupa1@automation.com";
        String password = "parola";

        LOG.info("Check 'Sign in' button");
        Assert.assertTrue(signInPage.inSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInPage.clickSignInButton();

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Complete the fields");
        signInPage.typeInSignInEmalilField(email);
        signInPage.typeInSignInPasswordField(password);

        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");

        LOG.info("Navigate back");
        signInPage.clickBack();

        LOG.info("Click 'Skip sign in' button");
        signInPage.clickSkipSignInButton();

    }
}
