package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.WishlistPage;

public class WishlistStepDefinition {

    HomePage homepage=new HomePage(Hook.driver);
    WishlistPage wishlistPage=new WishlistPage(Hook.driver);

    @And("user press wishlist icon on product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void add_to_wishlist(){

        homepage.product_wishlist_icon().click();
    }

    @Then("message \"The product has been added to your wishlist\" display")
    public void getMsg() throws InterruptedException {
        Thread.sleep(3000);

        String actualResult=homepage.wishlistMsg().getText();
        String expectedResult="The product has been added to your wishlist";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("user press the wishlist icon beside the login icon in website header")
    public void click_wishlist() throws InterruptedException {
        Thread.sleep(3000);
        homepage.wishlist_icon().click();
    }

    @Then("user navigate to wishlist page")
    public void navigate() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("https://demo.nopcommerce.com/wishlist",Hook.driver.getCurrentUrl());
    }

    @And("the product added is found")
    public void check_wishlist(){

        String actualResult=wishlistPage.wishlistProducts().getText();
        String expectedResult="HTC One M8 Android L 5.0 Lollipop";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
