package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/AppFeatures/AmazonHomeDashboard.feature"},
//@CucumberOptions(features={"src/test/resources/AppFeatures"},
glue= {"stepdefnitions", "AmazonHooks"},
plugin= {"pretty"},
monochrome=true,
dryRun=false)

public class Runner {

}


