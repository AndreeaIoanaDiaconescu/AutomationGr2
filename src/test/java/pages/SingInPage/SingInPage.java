package pages.SingInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SingInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SingInPage.class);
    public static SingInPage instance;

    private SingInPage() {
    }

    public static SingInPage getInstance(){
        if (instance == null){
            instance = new SingInPage();
        }
        return instance;
    }

    private By singInButton = By.id("btn1");

    public void clickSingInButton (){
        LOG.info("Click 'Sing in' Button");
        driver.findElement(singInButton).click();
    }

    public boolean inSingInButtondisplayed(){
        LOG.info("Verify if 'Sing in' button is displayed");
        return driver.findElement(singInButton).isDisplayed();
    }
}
