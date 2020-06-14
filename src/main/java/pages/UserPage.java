package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class UserPage {
    private BasePage browser;
    private By result = By.cssSelector(".success.message > div");
    public UserPage(BasePage browser){
        this.browser = browser;
    }

    public String verifyUserIsCreated(){
        browser.waitForThePageToBeLoaded();
        browser.waitForElement(result);
        return browser.getMessage(result);
    }
}
