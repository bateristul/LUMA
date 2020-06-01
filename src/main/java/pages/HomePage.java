package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class HomePage {

    private BasePage browser;
    private By welcome = By.xpath("//span[text()='Welcome, Veronica Costello!']");
    private By search = By.id("search");

    public HomePage(BasePage browser){
        this.browser = browser;
    }

    public HomePage open (){
        browser.visit("https://magento.nublue.co.uk/");
        return this;
    }

    public LoginPage clickSignInLink(){
        browser.clickLink("Sign In");
        return new LoginPage(browser);
    }

    public String ValidateLogin(){
        browser.waitForElement(welcome);
        return browser.getMessage(welcome);
    }

    public void SearchProduct(String text){
        browser.search(text, search);
        browser.clickLink(text);
    }

}
