package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;

public class CurrencyStepDefinition {
    HomePage home=new HomePage(Hook.driver);

    @And("user press on currency drop list and select Euro")
    public void press_currency(){
        Select select=new Select(home.currency());
        select.selectByVisibleText("Euro");
    }

    @Then("the four featured products prices changes to Euro")
    public void checkPrices() throws InterruptedException {
        Thread.sleep(1000);

        for(WebElement element:home.productsPrices()) {
            String actualResult=element.getText();
            Assert.assertEquals(actualResult.contains("€"),true);
        }
    }
}
