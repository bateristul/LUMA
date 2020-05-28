package base;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class Tests extends BaseTests {

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeMethod
    public void setPages(){
        loginPage = pages.getLoginPage();
        homePage = pages.getHomePage();
    }

    @Test
    public void validateLogIn(){
        loginPage.open().LoginFrom("roni_cost@example.com", "roni_cost3@example.com");
        assertTrue(homePage.ValidateLogin().contains("Welcome, Veronica Costello!"), "Alert text is incorrect!");
        System.out.println("Successfully Login test is done!");
    }
}
