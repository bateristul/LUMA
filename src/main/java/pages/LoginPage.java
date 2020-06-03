package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class LoginPage {

    private BasePage browser;
    private By usernameform = By.id("email");
    private By passwordform = By.id("pass");
    private By signin = By.id("send2");

    public LoginPage(BasePage browser){
        this.browser = browser;
    }

    public LoginPage open (){
        browser.visit("/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLm51Ymx1ZS5jby51ay8%2C/");
        return this;
    }

    public void ValidateCredentials(String username, String password){
        browser.typeIn(username, usernameform);
        browser.typeIn(password, passwordform);
        browser.click(signin);
    }

}
