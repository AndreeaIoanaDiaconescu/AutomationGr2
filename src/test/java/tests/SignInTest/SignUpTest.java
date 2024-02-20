package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

    public class SignUpTest extends BaseTest {
        public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

        @Test
        public void signUp() {
            String email = "ciascai.andreea@gmail.com" ;

            LOG.info("insert email");
            signInPage.insertEmail(email);

            LOG.info("click register button");
            signInPage.clickregisterButton();

        }
}
