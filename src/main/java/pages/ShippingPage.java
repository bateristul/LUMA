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
    private By adress = By.cssSelector("#shipping-new-address-form > fieldset >div.control > div.field._required");
    private By city = By.cssSelector("#shipping-new-address-form > div:nth-child(5) > div > input");
    private By dropdown = By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select");

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
        browser.waitForThePageToBeLoaded();
        browser.click(signInButton);
        browser.waitForThePageToBeLoaded();
    }

    public String checkFirstname(){
        browser.waitForThePageToBeLoaded();
        browser.waitUntilIsVisible(firstname);
        return browser.getMessage(firstname);
    }

    public void completeTheForm(String Street_Adress, String City){
        browser.typeIn(Street_Adress, adress);
        browser.typeIn(City, city);
        browser.select(dropdown, 30);
    }
}
