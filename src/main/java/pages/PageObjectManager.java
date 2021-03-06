package pages;

import framework.BasePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private BasePage basePage;
    private ShoppingCartPage shoppingCartPage;
    private ProductPage productPage;
    private ShippingPage shippingPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private UserPage userPage;
    private CustomerLoginPage customerLoginPage;

    public PageObjectManager(WebDriver driver){
        basePage = new BasePage(driver);
    }

    public ProductPage getProductPage(){
        return (productPage == null) ? productPage = new ProductPage(basePage) : productPage;
    }

    public ShoppingCartPage getShoppingCartPage(){
        return (shoppingCartPage == null) ? shoppingCartPage = new ShoppingCartPage(basePage) : shoppingCartPage;
    }
    public ShippingPage getShippingPage(){
        return (shippingPage == null) ? shippingPage = new ShippingPage(basePage) : shippingPage;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(basePage) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(basePage) : loginPage;
    }

    public RegisterPage getRegisterPage(){
        return (registerPage == null) ? registerPage = new RegisterPage(basePage) : registerPage;
    }

    public UserPage getUserPage(){
        return (userPage ==  null) ? userPage = new UserPage(basePage) : userPage;
    }

    public CustomerLoginPage getCustomerLoginPage(){
        return (customerLoginPage == null) ? customerLoginPage = new CustomerLoginPage(basePage) : customerLoginPage;
    }

}
