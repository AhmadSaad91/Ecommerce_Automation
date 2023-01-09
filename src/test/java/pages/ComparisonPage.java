package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComparisonPage {
    WebDriver driver;

    public ComparisonPage(WebDriver driver){
        this.driver=driver;
    }

    public List<WebElement> comparelistProducts(){

        return driver.findElements(By.xpath("//tr[@class=\"product-name\"]//td[@style=\"width:45%\"]"));
    }
}
