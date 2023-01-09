package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement searchBar(){

        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchBtn(){

        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public WebElement currency(){
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> productsPrices(){
        return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement product_wishlist_icon(){

        return driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@title=\"Add to wishlist\"]"));
    }

    public WebElement wishlistMsg(){

        return driver.findElement(By.cssSelector("p[class=\"content\""));
    }

    public WebElement wishlist_icon(){

        return driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }

    public WebElement computers_category(){

        return driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }

    public WebElement tags(){

        return driver.findElement(By.cssSelector("a[href=\"/awesome\"]"));
    }

    public WebElement awesome_tag(){

        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public WebElement product1_add_to_cart(){
        return driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement cartMsg(){

        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement product2_add_to_cart(){
        return driver.findElement(By.xpath("//div[@data-productid=\"43\"]//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement product_comparelist1_icon(){

        return driver.findElement(By.xpath("//div[@data-productid=\"1\"]//button[@title=\"Add to compare list\"]"));
    }

    public WebElement product_comparelist2_icon(){

        return driver.findElement(By.xpath("//div[@data-productid=\"4\"]//button[@title=\"Add to compare list\"]"));
    }

    public WebElement productComparison(){

        return driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }

    public WebElement parentCategoryComputers(){

        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]"));
    }

    public WebElement subCategoryNotebooks(){

        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/notebooks\"]"));
    }

    public WebElement parentCategoryApparel(){

        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/apparel\"]"));
    }

    public WebElement subCategoryShoes(){

        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/shoes\"]"));
    }

    public WebElement cart_icon(){

        return driver.findElement(By.className("cart-label"));
    }
}
