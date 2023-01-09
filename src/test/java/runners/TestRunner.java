package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "stepDefinitions",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                   "junit:target/cucumber-reports/Cucumber.xml",
                   "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@regression"
)

public class TestRunner {

}
