package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java",
					glue = "StepDefinations",
					monochrome = true,
					plugin = {"json:target/cucumber.json"}
				)
public class TestRunner extends AbstractTestNGCucumberTests {

}
