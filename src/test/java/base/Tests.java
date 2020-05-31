package base;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class Tests extends BaseTests {

    private LoginPage loginPage;
    private HomePage homePage;
    private ProductPage productPage;
    private ShoppingCartPage shoppingCartPage;
    private ShippingPage shippingPage;

    @BeforeMethod
    public void setPages(){
        loginPage = pages.getLoginPage();
        homePage = pages.getHomePage();
        productPage = pages.getProductPage();
        shoppingCartPage = pages.getShoppingCartPage();
        shippingPage = pages.getShippingPage();
    }

    @Test(priority = 1)
    public void validateLogIn(){
        loginPage.open().LoginFrom("roni_cost@example.com", "roni_cost3@example.com");
        assertTrue(homePage.ValidateLogin().contains("Welcome, Veronica Costello!"), "Alert text is incorrect!");
        System.out.println("Successfully Login test is done!");
    }

    @Test(priority = 2)
    public void validateLoginInBuingProcess(){
        homePage.open().SearchProduct("Marco Lightweight Active Hoodie");
        productPage.selectSizeAndColor();
        productPage.clickOnShoppingCart();
        shoppingCartPage.clickToCheckout();
        shippingPage.clickToSignIn();
        shippingPage.SignIn("roni_cost@example.com", "roni_cost3@example.com");
        assertTrue(shippingPage.FirstnameStatus().contains("Veronica"), "The text is incorrect!");
    }
}
