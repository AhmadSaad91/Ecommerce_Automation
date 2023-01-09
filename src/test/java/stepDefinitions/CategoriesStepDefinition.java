package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CategoryPage;
import pages.HomePage;

public class CategoriesStepDefinition {

    HomePage homepage=new HomePage(Hook.driver);
    CategoryPage page=new CategoryPage(Hook.driver);

    @And("user hover on category \"Computers\" and select sub category \"Notebooks\"")
    public void select_subCategory(){
        Actions action=new Actions(Hook.driver);
        action.moveToElement(homepage.parentCategoryComputers());
        action.moveToElement(homepage.subCategoryNotebooks());
        action.click().build().perform();
    }
    @Then("Notebooks products display")
    public void checkProducts(){
        String actualResult=page.productDisplay().getText();
        String expectedResult="Notebooks";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
