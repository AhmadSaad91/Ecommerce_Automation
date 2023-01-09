package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.SearchPage;

public class ProductSearchStepDefinition {
    HomePage home=new HomePage(Hook.driver);
    SearchPage page=new SearchPage(Hook.driver);

    @And("user enter \"laptop\" in search bar")
    public void product_search(){
        home.searchBar().sendKeys("laptop");
    }

    @And("user press search button")
    public void click_search(){
        home.searchBtn().click();
    }

    @Then("user navigate to search page")
    public void navigate() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("https://demo.nopcommerce.com/search?q=laptop",Hook.driver.getCurrentUrl());
    }

    @And("laptop items display")
    public void check_items_name(){

        for(WebElement element:page.searchResults()) {
            String actualResult=element.getText();
            Assert.assertEquals(actualResult.contains("Laptop"),true);
        }
    }

}
