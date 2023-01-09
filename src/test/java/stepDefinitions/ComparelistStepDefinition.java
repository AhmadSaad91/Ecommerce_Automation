package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ComparisonPage;
import pages.HomePage;

public class ComparelistStepDefinition {

    HomePage homepage=new HomePage(Hook.driver);
    ComparisonPage page=new ComparisonPage(Hook.driver);

    @And("user press compare list icon on product \"Build your own computer\"")
    public void add_to_comparelist1() throws InterruptedException {
        Thread.sleep(2000);
        homepage.product_comparelist1_icon().click();
    }

    @And("user press compare list icon on product \"Apple MacBook Pro 13-inch\"")
    public void add_to_comparelist2() throws InterruptedException {
        Thread.sleep(2000);
        homepage.product_comparelist2_icon().click();
    }

    @And("user press on the link product comparison in the displayed message")
    public void press_product_comparison() throws InterruptedException {
        Thread.sleep(2000);
        homepage.productComparison().click();
    }

    @Then("user navigate to compare products page")
    public void navigateToComparison() {

        Assert.assertEquals("https://demo.nopcommerce.com/compareproducts",Hook.driver.getCurrentUrl());
    }

    @And("the two added products display")
    public void checkComparison() {

        int productsNum=page.comparelistProducts().size();
        Assert.assertEquals(2,productsNum);
    }
}
