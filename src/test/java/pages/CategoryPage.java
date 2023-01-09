package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage {
    WebDriver driver;

    public CategoryPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement productDisplay(){
        return driver.findElement(By.className("page-title"));
    }

    public WebElement filter(){
        return driver.findElement(By.id("attribute-option-15"));
    }

    public List<WebElement> itemsNumber(){
        return driver.findElements(By.className("item-box"));
    }
}
