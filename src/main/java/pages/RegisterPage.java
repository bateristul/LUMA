package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class RegisterPage {

    private BasePage browser;
    private By firstnameForm = By.id("firstname");
    private By lastnameForm = By.id("lastname");
    private By emailForm = By.id("email_address");
    private By passForm = By.id("password");
    private By passConfirmForm = By.id("password-confirmation");
    private By submit = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");

    public RegisterPage(BasePage browser){
        this.browser = browser;
    }

    public RegisterPage open (){
        browser.visit("/customer/account/create/");
        return this;
    }

    public void createNewUser(String firstname, String lastname, String email, String password, String password_confirm){
        browser.typeIn(firstname, firstnameForm);
        browser.typeIn(lastname, lastnameForm);
        browser.typeIn(email, emailForm);
        browser.typeIn(password, passForm);
        browser.typeIn(password_confirm, passConfirmForm);
        browser.click(submit);
    }
}
