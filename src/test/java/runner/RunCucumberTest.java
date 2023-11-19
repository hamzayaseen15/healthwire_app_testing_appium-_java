package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.example.AppiumConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
    @BeforeClass
    public static void setUpAppium() throws Exception {
        AppiumConfig.setUp();
    }

    @AfterClass
    public static void tearDownAppium() {
        AppiumConfig.tearDown();
    }
}
