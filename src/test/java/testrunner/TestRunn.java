package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//features/LoginOrangeHRM.feature",
		glue="stepdefinition",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"
				
		}
		)

public class TestRunn {

}
