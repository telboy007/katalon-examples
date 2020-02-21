package basic_steps

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/Guest EX/Web UI Tests/Staging/GuestApp/", glue="", plugin = ["pretty", "html:CucumberReport"])

public class Staging_GuestAppFeatures {
}
