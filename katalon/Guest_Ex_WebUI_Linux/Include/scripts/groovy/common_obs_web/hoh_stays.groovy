package common_obs_web
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class hoh_stays {

	@When("I select a (.*)")
	def i_select_a_city(String city) {
		String TestCaseName = new StringBuilder().append('Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Top Header/SelectCity/').append(city)
		WebUI.callTestCase(findTestCase(TestCaseName),  [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('Search options expanded')
	def Search_options_expanded() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickSearchOptions'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I clear checkin dates by field')
	def I_clear_dates_by_field() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickClearDatesBy'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I select check in as current date')
	def I_select_checkin_current_date() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickCalendarCurrentDate'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I select Booking Status as Confirmed')
	def I_select_booking_status_confirmed() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickBookingStatus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I select Check in State as Confirmed')
	def I_select_checkin_state_confirmed() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickCheckinStateConfirmed'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I select check in State as Booking Confirm Message Not Sent')
	def I_select_checkin_state_confirm_not_sent() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickCheckinStateConfirmNotSent'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I select check in State as Booking Confirm Message Sent')
	def I_select_checkin_state_confirm_sent() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickCheckinStateConfirmSent'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When('I select check in State as Being Chased Not Confirmed')
	def I_select_checkin_state_being_chased() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickCheckinStateBeingChased'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When('I select check in type as Meet & Greet')
	def I_select_checkin_type_meet_greet() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickCheckinTypeMeetGreet'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When('I click search')
	def I_click_search() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickSearch'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I click HOH Stays')
	def I_click_HOH_Stays() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/Properties/ClickHOHStay'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('HOH STAYS page opened')
	def HOH_STAYS_page_opened() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/HOHStayPageOpened'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I click View for first HoHStay')
	def I_click_view_hohstay() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/ClickView'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('HoH Stay details page is opened')
	def hoh_stay_details_page_opened() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay Details/HOHStayDetailsPageOpened'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When('Meet&Greet is selected')
	def meet_greet_selected() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay Details/HOHStayDetailsMeetGreetSelected'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When('I click GUEST CHECK-IN FORM production link')
	def I_click_guest_checkin_link_production() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Production/ClickProductionGuestLink'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I click GUEST CHECK-IN FORM staging link')
	def I_click_guest_checkin_link_staging() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Staging/Pages/HOH Stay Details/ClickStagingGuestLink'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I click GUEST CHECK-IN FORM alpha link')
	def I_click_guest_checkin_link_alpha() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Alpha/Pages/HOH Stay Details/ClickAlphaGuestLink'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('HOH STAYS page displayed')
	def HOH_STAYS_page_displayed() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/HOHStayPageDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("(.*) hoh stays are displayed")
	def city_hoh_stays_are_displayed(String city) {
		String TestCaseName = new StringBuilder().append('Guest EX/Cucumber Features Steps/OPS Web/Common/Pages/HOH Stay/VerifyCity/HohStaysDisplayed').append(city)
		WebUI.callTestCase(findTestCase(TestCaseName),  [:], FailureHandling.STOP_ON_FAILURE)
	}
}
