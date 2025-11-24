import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue= {"stepdefinition"},tags="@smoketesting",
plugin = { "pretty","html:C:\\Selenium demo\\bddemo\\cucumber-reports" },
monochrome = true)
public class testrunner {

}
