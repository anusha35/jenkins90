package cumcumrunnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources"},format={"pretty","html:target/html-reports/"},
monochrome = true)



public class testrunner {
	
}
