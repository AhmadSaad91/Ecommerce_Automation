package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;

public class RegisterStepDefinition {
    RegisterPage register=new RegisterPage(Hook.driver);

    @When("user press register")
    public void press_register(){
        register.pressRegister().click();
    }

    @And("user enter first name and last name")
    public void firstName_lastName(){
        register.firstName().sendKeys("Ahmed");
        register.lastName().sendKeys("Khaled");
    }

    @And("user enter valid Email")
    public void Email(){
        register.Email().sendKeys("ahmedwalyy91@mail.com");
    }

    @And("user enter password")
    public void passwordFields(){
        register.password().sendKeys("12345678");
        register.confirmPassword().sendKeys("12345678");
    }

    @And("user click on register button")
    public void pressRegBtn(){
        register.registerBtn().click();
    }

    @Then("success message displayed")
    public void successMsg() throws InterruptedException {
    Thread.sleep(1000);

        String actualResult=register.message().getText();

        String expectedResult="Your registration completed";

        Assert.assertTrue(actualResult.contains(expectedResult));

        //Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",Hook.driver.getCurrentUrl());
    }

}
