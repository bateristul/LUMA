package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class BuyTest extends  BaseTests {

    private HomePage homePage;
    private LoginPage loginPage;
    private ProductPage productPage;
    private ShoppingCartPage shoppingCartPage;
    private ShippingPage shippingPage;

    @BeforeMethod
    public void setPages(){
        productPage = pages.getProductPage();
        shoppingCartPage = pages.getShoppingCartPage();
        shippingPage = pages.getShippingPage();
        homePage = pages.getHomePage();
        loginPage = pages.getLoginPage();
    }


    @Test(priority = 1)
    public void validateLoginInBuyingProcess(){
        /*
        homePage.open().SearchProduct("Marco Lightweight Active Hoodie");
        productPage.selectSizeAndColor();
        productPage.clickOnShoppingCart();
        shoppingCartPage.clickToCheckout();
        shippingPage.clickToSignInLink();
        shippingPage.SignIn("roni_cost@example.com", "roni_cost3@example.com");
        shippingPage.completeTheForm("Dr. Bratianu nr.3", "Suceava", 30);*/
        //assertTrue(shippingPage.checkFirstname().contains("Veronica"), "The text is incorrect!");
        loginPage.open().ValidateCredentials("roni_cost@example.com", "roni_cost3@example.com");
        assertTrue(homePage.ValidateLogin().contains("Welcome, Veronica Costello!"), "Alert text is incorrect!");
        homePage.open().SearchProduct("Marco Lightweight Active Hoodie");
        productPage.selectSizeAndColor();
        productPage.clickOnShoppingCart();
        shoppingCartPage.clickToCheckout();
        shippingPage.checkMethods();
        System.out.println("Successfully Login test is done!");
    }

    @Test(priority = 2)
    public void searchItemAndBuyIt(){}
}
