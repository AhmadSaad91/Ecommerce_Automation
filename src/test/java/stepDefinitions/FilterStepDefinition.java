package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CategoryPage;
import pages.HomePage;

public class FilterStepDefinition {
    HomePage homepage=new HomePage(Hook.driver);
    CategoryPage page=new CategoryPage(Hook.driver);

    @And("user hover on category \"Apparel\" and select sub category \"Shoes\"")
    public void select_subCategory(){
        Actions action=new Actions(Hook.driver);
        action.moveToElement(homepage.parentCategoryApparel());
        action.moveToElement(homepage.subCategoryShoes());
        action.click().build().perform();
    }

    @And("user select \"red\" filter")
    public void select_filter(){
        page.filter().click();
    }

    @Then("only one product display")
    public void count_items() throws InterruptedException {
        Thread.sleep(1000);
        int count=page.itemsNumber().size();
        Assert.assertEquals(1,count);
    }
}
