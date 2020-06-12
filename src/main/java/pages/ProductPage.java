package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class ProductPage {
    private BasePage browser;
    private By sSize = By.id("option-label-size-142-item-168");
    private By color = By.id("option-label-color-93-item-50");
    private By addToCart = By.id("product-addtocart-button");
    private By shoppingCart = By.cssSelector("#maincontent > div.page.messages > div:nth-child(2) > div > div > div > a");
    private By toWishList = By.cssSelector(".action.towishlist");

    public ProductPage(BasePage browser){
        this.browser = browser;
    }

    public void selectSizeAndColor(){
        browser.waitForThePageToBeLoaded();
        browser.click(sSize);
        browser.click(color);
        browser.click(addToCart);
    }

    public void clickOnShoppingCart(){
        browser.waitUntilIsVisible(shoppingCart);
        browser.clickLink("shopping cart");
    }

    public void clickWishList(){
        browser.click(toWishList);
    }

}
