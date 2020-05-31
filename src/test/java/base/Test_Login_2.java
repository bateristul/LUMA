package base;

import framework.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.ShippingPage;
import pages.ShoppingCartPage;


import static org.testng.Assert.assertTrue;

public class Test_Login_2 extends BaseTests {

    private ProductPage productPage;
    private ShoppingCartPage shoppingCartPage;
    private ShippingPage shippingPage;

    @BeforeMethod
    public void setPages(){
        productPage = pages.getProductPage();
        shoppingCartPage = pages.getShoppingCartPage();
        shippingPage = pages.getShippingPage();
    }


    @Test
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
