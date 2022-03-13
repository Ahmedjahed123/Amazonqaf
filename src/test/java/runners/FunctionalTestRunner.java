package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "steps",
		tags = "@AmazonLogin",
		plugin = "pretty"
		
		
		
		)

public class FunctionalTestRunner extends AbstractTestNGCucumberTests{

}
