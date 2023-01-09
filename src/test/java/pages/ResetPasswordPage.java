package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {

    WebDriver driver;

    public ResetPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement recoverBtn(){
        return driver.findElement(By.cssSelector("button[name=\"send-email\"]"));

    }

    public WebElement displayedMsg(){
        return driver.findElement(By.className("content"));

    }
}
