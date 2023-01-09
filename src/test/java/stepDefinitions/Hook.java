package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    public static WebDriver driver=null;

    @Before
    public void open_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
