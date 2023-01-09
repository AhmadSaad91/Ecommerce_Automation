package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement pressLogin(){

        return driver.findElement(By.className("ico-login"));
    }

    public WebElement Email(){

        return driver.findElement(By.id("Email"));
    }

    public WebElement password(){

        return driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn(){

        return driver.findElement(By.xpath("//div[@class=\"buttons\"]//button[@type=\"submit\"]"));
    }

    public WebElement forgotPassword(){

        return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

}
