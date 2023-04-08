package runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "steps",
        tags = "@Sanity",plugin = {"pretty","html:target/reports/report.html"} )
public class TestRunner {
}
