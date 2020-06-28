package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.ShippingPage;
import pages.ShoppingCartPage;

import static org.testng.Assert.assertTrue;

public class BuyTest extends  BaseTests {

    private HomePage homePage;
    private ProductPage productPage;
    private ShoppingCartPage shoppingCartPage;
    private ShippingPage shippingPage;

    @BeforeMethod
    public void setPages(){
        productPage = pages.getProductPage();
        shoppingCartPage = pages.getShoppingCartPage();
        shippingPage = pages.getShippingPage();
        homePage = pages.getHomePage();
    }


    @Test(priority = 1)
    public void validateLoginInBuyingProcess(){
        homePage.open().SearchProduct("Marco Lightweight Active Hoodie");
        productPage.selectSizeAndColor();
        productPage.clickOnShoppingCart();
        shoppingCartPage.clickToCheckout();
        shippingPage.clickToSignInLink();
        shippingPage.SignIn("roni_cost@example.com", "roni_cost3@example.com");
        //assertTrue(shippingPage.checkFirstname().contains("Veronica"), "The text is incorrect!");
    }

    @Test(priority = 2)
    public void searchItemAndBuyIt(){}
}
