package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.ProductRedeemPage;

public class ShoppingCartStepDefinition {

    HomePage homepage=new HomePage(Hook.driver);
    ProductRedeemPage productRedeem=new ProductRedeemPage(Hook.driver);

    @And("user press add to cart on product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void add_to_cart_p1(){

        homepage.product1_add_to_cart().click();
    }

    @Then("message \"The product has been added to your shopping cart\" display")
    public void msgDisplay() throws InterruptedException {

        Thread.sleep(3000);

        String actualResult=homepage.cartMsg().getText();
        String expectedResult="The product has been added to your shopping cart";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("user press add to cart on product \"$25 Virtual Gift Card\"")
    public void add_to_cart_p2(){

        homepage.product2_add_to_cart().click();
    }

    @And("user enter Recipient's Name")
    public void recipientsName() throws InterruptedException {
        Thread.sleep(2000);
        productRedeem.recipientsName().sendKeys("Mohamed");
    }

    @And("user enter Recipient's Email")
    public void recipientsEmail(){

        productRedeem.recipientsEmail().sendKeys("mks@gmail.com");
    }

    @And("user enter his Name")
    public void name(){
        productRedeem.name().clear();
        productRedeem.name().sendKeys("Ahmed");
    }

    @And("user enter his Email")
    public void email(){
        productRedeem.email().clear();
        productRedeem.email().sendKeys("ahmedwalyy91@mail.com");
    }

    @And("user click on add to cart")
    public void add_to_cart() {
        productRedeem.add_to_cart().click();
    }
}
