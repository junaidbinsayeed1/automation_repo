package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
				(features = "C:\\Automation\\Framework\\src\\test\\resources\\Features\\Checkout.feature",
				 glue = "StepDefination",
				 dryRun = false,
				 monochrome = true,
				 plugin={"pretty","html:target/HTML Reports"}
				)

public class TestRunner
{
	
}


