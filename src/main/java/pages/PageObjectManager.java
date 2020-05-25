package pages;

import framework.BasePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private BasePage basePage;

    public PageObjectManager(WebDriver driver){
        basePage = new BasePage(driver);
    }
}
