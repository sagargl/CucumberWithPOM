package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features={"C:/Users/swath/eclipse-workspace/Cucumber_PageObject_Sagar/src/test/resources/AppFeatures/AmazonHomeDashobard.feature"},
@CucumberOptions(features={"src/test/resources/AppFeatures/NewReleases.feature"},
glue= {"stepdefnitions", "AppHooksWithExtendsTestBase"},
plugin= {"pretty"},
monochrome=true,
dryRun=false)


public class NewReleasePageTest {

}


