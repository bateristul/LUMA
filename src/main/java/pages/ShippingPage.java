package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class ShippingPage {

    private BasePage browser;
    private By signInLink = By.xpath("//*[@id=\"checkout\"]/div[1]/button");
    private By emailForm = By.id("login-email");
    private By passForm = By.id("login-password");
    private By signInButton = By.cssSelector("#modal-content-6 > div > div > div.block-content > form > div.actions-toolbar > div.primary > button");
    private By firstname = By.cssSelector("#shipping-new-address-form > div:nth-child(1) > div > input");

    public ShippingPage(BasePage browser){
        this.browser = browser;
    }

    public void clickToSignInLink(){
        browser.waitUntilIsVisible(signInLink);
        browser.waitUntilIsClickable(signInLink);
        browser.click(signInLink);
    }

    public void SignIn(String email, String password){
        browser.typeIn(email, emailForm);
        browser.typeIn(password, passForm);
        browser.click(signInButton);
        browser.waitForThePageToBeLoaded();
    }

    public String checkFirstname(){
        browser.waitForThePageToBeLoaded();
        browser.waitUntilIsVisible(firstname);
        return browser.getMessage(firstname);
    }
}
