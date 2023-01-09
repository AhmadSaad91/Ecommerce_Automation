package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BillingPage;
import pages.CartPage;
import pages.HomePage;

public class SuccessOrderStepDefinition {

    HomePage homePage=new HomePage(Hook.driver);
    CartPage cartPage=new CartPage(Hook.driver);
    BillingPage billingPage=new BillingPage(Hook.driver);

    @And("user click on shopping cart")
    public void click_cart_icon() throws InterruptedException {
        Thread.sleep(5000);
        homePage.cart_icon().click();
    }

    @And("user click on agree terms")
    public void agree_terms() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.terms().click();
    }

    @And("user press checkout")
    public void press_checkout(){
        cartPage.checkOut().click();
    }

    @And("user fill billing address")
    public void fill_address() throws InterruptedException {
        Thread.sleep(1000);
        Select select=new Select(billingPage.country());
        select.selectByVisibleText("Egypt");
        billingPage.city().sendKeys("Cairo");
        billingPage.address().sendKeys("New Cairo");
        billingPage.code().sendKeys("12345");
        billingPage.phone().sendKeys("01006110667");
        billingPage.continue1().click();

    }

    @And("user select shipping method")
    public void shipping_method() throws InterruptedException {
        Thread.sleep(1000);
        billingPage.continue2().click();

    }

    @And("user select payment method")
    public void payment_method() throws InterruptedException {
        Thread.sleep(1000);
        billingPage.continue3().click();

    }

    @And("user confirm order")
    public void confirm_order() throws InterruptedException {
        Thread.sleep(1000);
        billingPage.continue4().click();
        Thread.sleep(2000);
        billingPage.confirm().click();
    }

    @Then("success message display")
    public void check_msg() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult=billingPage.msg().getText();

        String expectedResult="Your order has been successfully processed!";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
