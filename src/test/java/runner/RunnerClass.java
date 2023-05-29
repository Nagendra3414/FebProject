package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "C:\\Users\\Nagendra\\OneDrive\\Desktop\\Feb\\Cucumber\\src\\test\\java\\features\\" }, glue = {
				"StepDefinitions" }, plugin = { "pretty",
						"html:target\\deepak.html" }, monochrome = true, tags = "@Sanity or @Smoke"

)

public class RunnerClass {

}
