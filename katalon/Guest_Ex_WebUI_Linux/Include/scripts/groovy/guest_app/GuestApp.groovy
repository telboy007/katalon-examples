package guest_app
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

import cucumber.api.java.en.Then


class GuestApp {

	@Then('Guest App is opened')
	def guest_app_opened() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Guest App/GuestAppOpened'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Guest app page display expired page')
	def guest_app_page_expired() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Guest App/GuestAppExpired'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Guest app checkin initial page opens')
	def guest_app_page_initial_checkin() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Guest App/GuestAppInitialCheckin'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Guest app checkin (.*) initial page opens")
	def guest_app_checkin_city_initial (String city) {
		String TestCaseName = new StringBuilder().append('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Guest App/GuestAppBCMSentDefaultPageCity/').append(city)
		WebUI.callTestCase(findTestCase(TestCaseName),  [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Guest app checkin (.*) confirmed page opened")
	def guest_app_checkin_city_confirmed (String city) {
		String TestCaseName = new StringBuilder().append('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Guest App/GuestAppBCMConfirmedPageCity/').append(city)
		WebUI.callTestCase(findTestCase(TestCaseName),  [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('drop-down sections can be viewed')
	def dropdown_section_viewed() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Guest App/GuestAppDropDownViewed'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}