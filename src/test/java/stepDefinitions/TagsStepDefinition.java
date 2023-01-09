package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;


public class TagsStepDefinition {
    HomePage home=new HomePage(Hook.driver);

    @And("user select \"Comuters\" category")
    public void select_category(){
        home.computers_category().click();
    }

    @And("user select \"Awesome\" tag")
    public void select_tag(){
        home.tags().click();
    }

    @Then("products tagged with 'Awesome' displays")
    public void productsDisplays(){

        String actualResult=home.awesome_tag().getText();
        Assert.assertEquals(actualResult.contains("awesome"),true);
    }
}
