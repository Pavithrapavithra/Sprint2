
package options;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.testng.annotations.Test;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//@RunWith(Cucumber.class)
@Test
@CucumberOptions(
		features = "src/test/java/feature/",
		glue = "stepdefinitions"
//		dryRun = true
//		monochrome = true
//		format =pretty
//		tags = "@NegativeTest"
		)

public class TestRun extends AbstractTestNGCucumberTests {

}
