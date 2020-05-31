package pages;

import framework.BasePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private BasePage basePage;
    private ShoppingCartPage shoppingCartPage;
    private ProductPage productPage;
    private ShippingPage shippingPage;

    public PageObjectManager(WebDriver driver){
        basePage = new BasePage(driver);
    }
}
