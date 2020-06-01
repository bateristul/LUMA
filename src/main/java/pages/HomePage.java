package pages;

import framework.BasePage;

public class HomePage {
    BasePage browser;

    public HomePage(BasePage browser){
        this.browser = browser;
    }

    public void SearchProduct(String text){
        browser.search(text, search);
        browser.clickLink(text);
    }
}
