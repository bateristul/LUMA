package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class RegisterWithProductOnWishlistTest extends BaseTests{

    private HomePage homePage;
    private ProductPage productPage;
    private CustomerLoginPage customerLoginPage;
    private RegisterPage registerPage;
    private UserPage userPage;

    @BeforeMethod
    public void setPages(){
        homePage = pages.getHomePage();
        productPage = pages.getProductPage();
        customerLoginPage = pages.getCustomerLoginPage();
        registerPage = pages.getRegisterPage();
        userPage = pages.getUserPage();
    }

    @Test
    public void testRegisterWithProductOnWishlist(){
        homePage.open().SearchProduct("Marco Lightweight Active Hoodie");
        productPage.clickWishList();
        customerLoginPage.clickOnCreateAnAccount();
        registerPage.createNewUser("Dinu", "Marian", "as237fdfjk@yahoo.com", "qwerty12345D", "qwerty12345D");
        assertTrue(userPage.verifyUserIsCreated().contains("Thank you for registering with Main Website Store."), "The message is not correct!");
    }

}
