package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class LoginPage {

    private BasePage browser;
    private By username = By.id("email");
    private By password = By.id("pass");
    private By signin = By.id("send2");

    public LoginPage(BasePage browser){
        this.browser = browser;
    }

    public LoginPage open (){
        browser.visit("/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLm51Ymx1ZS5jby51ay8%2C/");
        return this;
    }

    public void LoginFrom(String text1, String text2){
        browser.typeIn(text1, username);
        browser.typeIn(text2, password);
        browser.click(signin);
    }

}
