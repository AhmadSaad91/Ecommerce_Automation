package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStepDefinition {
    LoginPage login=new LoginPage(Hook.driver);

    @When("user press login")
    public void press_login(){
        login.pressLogin().click();
    }

    @And("user enter Email")
    public void Email(){
        login.Email().sendKeys("ahmedwalyy91@mail.com");
    }

    @And("user enter valid password")
    public void password(){
        login.password().sendKeys("12345678");
    }

    @And("user click on login button")
    public void pressLoginBtn(){
        login.loginBtn().click();
    }

    @Then("user go to home page")
    public void homePage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("https://demo.nopcommerce.com/",Hook.driver.getCurrentUrl());
    }

}
