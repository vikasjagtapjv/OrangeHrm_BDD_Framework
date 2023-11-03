package StepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\vikas\\eclipse-workspace\\OrangeHrmBDD\\Feature\\Login.feature"},
		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/Cucumber-Reports/reports01.html"}
		)


public class Runner_ {

}
