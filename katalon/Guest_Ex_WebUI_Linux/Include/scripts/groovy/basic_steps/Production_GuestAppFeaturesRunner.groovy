package basic_steps

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/Guest EX/Web UI Tests/Production/GuestApp/", glue="", plugin = ["pretty","html:ReportFolder"])

public class Production_GuestAppFeatures {
}
