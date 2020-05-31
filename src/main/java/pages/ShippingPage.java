package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class ShippingPage {

    private BasePage browser;
    private By signIn = By.xpath("//*[@id=\"checkout\"]/div[1]/button");
    private By emailForm = By.id("login-email");
    private By passForm = By.id("login-password");
    private By signInButton = By.cssSelector("#modal-content-6 > div > div > div.block-content > form > div.actions-toolbar > div.primary > button");
    private By firstname = By.id("#X1D25GC");

    public ShippingPage(BasePage browser){
        this.browser = browser;
    }

    public void clickToSignIn(){
        browser.waitUntilIsVisible(signIn);
        browser.waitUntilIsClickable(signIn);
        browser.click(signIn);
    }

    public void SignIn(String text1, String text2){
        browser.typeIn(text1, emailForm);
        browser.typeIn(text2, passForm);
        browser.click(signInButton);
        browser.waitForThePageToBeLoaded();
    }

    public String FirstnameStatus(){
        browser.waitForElement(firstname);
        return browser.getMessage(firstname);
    }
}
