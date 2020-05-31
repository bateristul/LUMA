package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    private BasePage browser;
    private By checkoutButton = By.cssSelector("#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li:nth-child(1) > button");

    public ShoppingCartPage(BasePage browser){
        this.browser = browser;
    }

    public void clickToCheckout(){
        browser.click(checkoutButton);
        browser.waitForThePageToBeLoaded();
    }

}