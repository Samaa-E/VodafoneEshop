package PurchaseIphoneProduct;

import basePackage.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utilities.DriverSetup;

public class PurchaseIphoneProductSteps extends BaseTest
{
    HomePage homePage;
    IphoneProductsPage iphoneProductsPage;
    AppleWatchNikeSEGPS44mmPage appleWatchNikeSEGPS44mmPage;
    ShoppingCartPage shoppingCartPage;
    CheckoutPage checkoutPage;


    @Given("User opens vodafone eshop Home Page")
    public void userOpensVodafoneEshopHomePage()
    {
        this.driver = DriverSetup.DriverInitiate("chrome");
        homePage = new HomePage(this.driver);
        Assert.assertEquals(driver.getTitle(),"Vodafone Shop");
    }

    @And("User Choose English Language")
    public void userChooseEnglishLanguage()
    {
        homePage.pressEnglishBtn();
    }

    @When("User selects iphone products")
    public void userSelectsIphoneProducts()
    {
        homePage.pressIphoneBrandBtn();
        iphoneProductsPage = new IphoneProductsPage(this.driver);
    }

    @And("User select a product")
    public void userSelectAProduct()
    {
        iphoneProductsPage.selectAppleWatchNikeSEGPS44mm();
        appleWatchNikeSEGPS44mmPage = new AppleWatchNikeSEGPS44mmPage(this.driver);
        Assert.assertEquals(appleWatchNikeSEGPS44mmPage.getProductTitle(),"Apple Watch Nike SE GPS, 44mm");
    }

    @And("User added a product to basket")
    public void userAddedAProductToBasket()
    {
        appleWatchNikeSEGPS44mmPage.PressAddToBasketBtn();
    }

    @And("User Checkout")
    public void userCheckout()
    {
        shoppingCartPage = new ShoppingCartPage(this.driver);
        shoppingCartPage.pressCheckoutBtn();
    }

    @And("User entered Address")
    public void userEnteredAddress()
    {
        checkoutPage = new CheckoutPage(this.driver);
        checkoutPage.fillUserAddress();
    }


    @And("User click continue with empty Full Name")
    public void userClickContinueWithEmptyFullName()
    {
        checkoutPage.pressContBtn();
    }

    @Then("Error Message appears with text {string}")
    public void errorMessageAppearsWithText(String arg0)
    {
        Assert.assertEquals(checkoutPage.getErrorMessageTxt(),arg0);
        System.out.println(arg0);
        System.out.println(checkoutPage.getErrorMessageTxt());
    }
}
