package setupTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import groovy.json.JsonSlurper

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class mySteps {

	@Given('API token is present')
	def api_token_is_present() {
		WS.verifyNotEqual(GlobalVariable.g_auth_token, null)
	}

	@When('^I send a "(.*)" request with (.*), (.*), (.*) and (.*)$')
	def create_new_hoh_stay(String method, property_id, checkin_time, checkout_time, channel) {
		GlobalVariable.g_channel = channel
		GlobalVariable.g_property_id = property_id
		GlobalVariable.g_checkin_time = checkin_time
		GlobalVariable.g_checkout_time = checkout_time
		ResponseObject ro = WS.sendRequest(findTestObject('Object Repository/Test Data Setup/Create HoH Stay'))
		GlobalVariable.g_latest_response = ro
		GlobalVariable.g_response_text = ro.getResponseText()
	}

	@Then('^I get expected response code "(.*)"$')
	def get_response_code(String code) {
		WS.verifyResponseStatusCode(GlobalVariable.g_latest_response, code as Integer)
	}

	@And('^I capture the hoh stay id of (.*)$')
	def write_booking_id_to_global_variable(String id) {
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText(GlobalVariable.g_response_text)
		println("json: " + object)
		GlobalVariable.g_booking_id = object.id
	}

	@And('^I assign (.*) and (.*) to services of (.*)$')
	def assign_services_to_user(String hk_user, ww_user, id) {
		ResponseObject ro = WS.sendRequest(findTestObject('Object Repository/Test Data Setup/Get Services'))
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText(ro.getResponseText())
		println("json: " + object)
		for(def member : object) {
			if(member.serviceType == 'housekeeping_service') {
				println("Housekeeping service:" + member.id)
				GlobalVariable.g_event_id = member.id
				GlobalVariable.g_user_id = hk_user
				ResponseObject ro1 = WS.sendRequest(findTestObject('Object Repository/Test Data Setup/Assign User to Service'))
			}
			if(member.serviceType == 'checkin_service') {
				println("Welcome Wizard service:" + member.id)
				GlobalVariable.g_event_id = member.id
				GlobalVariable.g_user_id = ww_user
				ResponseObject ro1 = WS.sendRequest(findTestObject('Object Repository/Test Data Setup/Assign User to Service'))
			}
		}
	}
}