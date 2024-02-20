package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
private String newUrl = getBaseUrl() = "Register.html" ;
        String firstName = "Ion";
        String lastName = "Popescu";

        @Test
        public void fillRegister() {
            driver.get(newUrl);
            sleep(ms: 3000L);

            LOG.info("Typing full name");
            registerPage.insertFullName(firstName, lastName);
        }
    }
}