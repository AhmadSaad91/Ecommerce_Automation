package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement terms(){
        return driver.findElement(By.id("termsofservice"));
    }

    public WebElement checkOut(){
        return driver.findElement(By.id("checkout"));
    }
}
