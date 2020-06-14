package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.UserPage;

import static org.testng.Assert.assertTrue;

public class RegisterUserTest extends BaseTests{

    private RegisterPage registerPage;
    private HomePage homePage;
    private UserPage userPage;
    private LoginPage loginPage;

    @BeforeMethod
    public void setPages(){
        homePage = pages.getHomePage();
        registerPage = pages.getRegisterPage();
        userPage = pages.getUserPage();
    }

    @Test
    public void testRegisterUser(){
        registerPage.open().createNewUser("Dinu", "Marian", "wedji4597h@yahoo.com", "qwerty12345D", "qwerty12345D");
        assertTrue(userPage.verifyUserIsCreated().contains("Thank you for registering with Main Website Store."), "The message is not correct!");
    }
}
