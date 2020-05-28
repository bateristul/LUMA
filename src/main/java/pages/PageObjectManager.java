package pages;

import framework.BasePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private BasePage basePage;
    private HomePage homePage;
    private LoginPage loginPage;

    public PageObjectManager(WebDriver driver){
        basePage = new BasePage(driver);
    }

    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(basePage) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(basePage) : loginPage;
    }
}
