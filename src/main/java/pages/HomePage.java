package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class HomePage {
    BasePage browser;
    private By search = By.id("search");

    public HomePage(BasePage browser){
        this.browser = browser;
    }

    public HomePage open (){
        browser.visit("https://magento.nublue.co.uk/");
        return this;
    }

    public void SearchProduct(String text){
        browser.search(text, search);
        browser.clickLink(text);
    }
}
