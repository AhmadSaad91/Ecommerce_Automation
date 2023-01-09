package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {
    WebDriver driver;

    public WishlistPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement wishlistProducts(){
        return driver.findElement(By.cssSelector("a[class=\"product-name\"]"));
    }
}
