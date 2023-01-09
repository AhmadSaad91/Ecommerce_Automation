package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver=driver;
    }

    public List<WebElement> searchResults(){
        return driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
}
