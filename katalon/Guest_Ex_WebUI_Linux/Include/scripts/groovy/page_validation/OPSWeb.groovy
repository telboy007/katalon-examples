package page_validation
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class OPSWeb {

	@Given('Home page is displayed')
	def Home_page_is_displayed() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Properties/HomePageDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('London city is displayed by default')
	def London_city_is_displayed_by_default() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Staging/OpsStagingLondonDropdown'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('All is displayed by default for cities')
	def All_is_displayed_by_default() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Alpha/OPSAlphaAllByDefault'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I click on top bar city dropdown')
	def I_click_on_top_bar_city_dropdown() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Top Header/SelectCityDropdown'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then('OPS Staging page is loaded')
	def ops_Staging_page_is_loaded() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Staging/StagingHomePageOpened'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('All cities are displayed')
	def All_cities_are_displayed() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Top Header/VerifyCitiesDropdown'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}
}


