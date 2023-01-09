package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductRedeemPage {

    WebDriver driver;

    public ProductRedeemPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement recipientsName(){
        return driver.findElement(By.id("giftcard_43_RecipientName"));
    }

    public WebElement recipientsEmail(){
        return driver.findElement(By.id("giftcard_43_RecipientEmail"));
    }

    public WebElement name(){
        return driver.findElement(By.id("giftcard_43_SenderName"));
    }

    public WebElement email(){
        return driver.findElement(By.id("giftcard_43_SenderEmail"));
    }

    public WebElement add_to_cart(){
        return driver.findElement(By.id("add-to-cart-button-43"));
    }
}
