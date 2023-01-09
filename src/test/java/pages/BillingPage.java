package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hook;

public class BillingPage {
    WebDriver driver;

    public BillingPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement country(){
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }

    public WebElement city(){
        return driver.findElement(By.id("BillingNewAddress_City"));
    }

    public WebElement address(){
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    public WebElement code(){
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    public WebElement phone(){
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public WebElement continue1(){
       return driver.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]//button[@name=\"save\"]"));
    }

    public WebElement continue2(){
       return driver.findElement(By.xpath("//div[@id=\"shipping-method-buttons-container\"]//button[@type=\"button\"]"));
    }

    public WebElement continue3(){
       return driver.findElement(By.xpath("//div[@id=\"payment-method-buttons-container\"]//button[@type=\"button\"]"));
    }

    public WebElement continue4(){
       return driver.findElement(By.xpath("//div[@id=\"payment-info-buttons-container\"]//button[@type=\"button\"]"));
    }

    public WebElement confirm(){
       return driver.findElement(By.xpath("//div[@id=\"confirm-order-buttons-container\"]//button[@type=\"button\"]"));
    }

    public WebElement msg(){
       return driver.findElement(By.xpath("//div[@class=\"section order-completed\"]//div[@class=\"title\"]"));
    }
}
