package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ResetPasswordStepDefinition {

    ResetPasswordPage resetPassword=new ResetPasswordPage(Hook.driver);
    LoginPage login=new LoginPage(Hook.driver);

    @And("user press forgot password")
    public void pressForgotPassword(){
        login.forgotPassword().click();
    }

    @And("user enter valid email address")
    public void enterEmail(){
        resetPassword.email().sendKeys("ahmedwalyy91@mail.com");
    }

    @And("user click on recover button")
    public void pressRecover(){
        resetPassword.recoverBtn().click();
    }

    @Then("message \"Email with instructions has been sent to you.\" display")
    public void msgDisplay() throws InterruptedException {
        Thread.sleep(1000);

        String actualResult = resetPassword.displayedMsg().getText();
        String expectedResult = "Email with instructions has been sent to you.";

        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
