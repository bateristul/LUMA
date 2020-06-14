package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class CustomerLoginPage {

    private BasePage browser;
    private By clickRegister = By.cssSelector(".action.create.primary");

    public CustomerLoginPage(BasePage browser){
        this.browser = browser;
    }

    public void clickOnCreateAnAccount(){
        browser.waitForThePageToBeLoaded();
        browser.click(clickRegister);
    }
}
