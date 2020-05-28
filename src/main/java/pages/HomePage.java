package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class HomePage {

    private BasePage browser;
    private By welcome = By.xpath("//span[text()='Welcome, Veronica Costello!']");

    public HomePage(BasePage browser){
        this.browser = browser;
    }

    public LoginPage clickSignIn(){
        browser.clickLink("Sign In");
        return new LoginPage(browser);
    }

    public String ValidateLogin(){
        browser.waitForElement(welcome);
        return browser.getMessage(welcome);
    }

}
