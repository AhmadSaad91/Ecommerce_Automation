package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement pressRegister(){

        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement firstName(){

        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName(){

        return driver.findElement(By.id("LastName"));
    }

    public WebElement Email(){

        return driver.findElement(By.id("Email"));
    }

    public WebElement password(){

        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword(){

        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBtn(){

        return driver.findElement(By.id("register-button"));
    }

    public WebElement message(){

        return driver.findElement(By.className("result"));
    }

}
