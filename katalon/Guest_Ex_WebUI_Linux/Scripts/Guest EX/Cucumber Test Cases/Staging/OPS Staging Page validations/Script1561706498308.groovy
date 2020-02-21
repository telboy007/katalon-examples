import org.junit.runner.RunWith

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="/home/aleksejs/Documents/Repos/qa-tools/katalon/Guest_Ex_WebUI_Linux/Include/features/Guest EX/Web UI Tests", glue="", plugin = ["pretty",
					 "junit:/home/aleksejs/Documents/Repos/qa-tools/katalon/cucumber.xml"])
public class MyCucumberRunner {}

CucumberKW.runWithCucumberRunner(MyCucumberRunner.class)