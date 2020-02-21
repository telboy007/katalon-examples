package login
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class LoginSteps {

	@Given('The Login page is loaded successfully')
	def The_Login_page_is_loaded_successfully() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Login/Gmail Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('OPS Staging login page is opened')
	def ops_Staging_login_page_is_opened() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Staging/StagingLoginPageOpened'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('I open gmail login page')
	def I_open_gmail_login_page() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/OpenGmailLogin'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('Login to OPS Staging is successful')
	def Login_to_OPS_Staging_is_successful() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Login/OpsStagingLoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given('Login to OPS Production is successful')
	def Login_to_OPS_Production_is_successful() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Login/OpsProductionLoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given('Login to OPS Alpha is successful')
	def Login_to_OPS_Alpha_is_successful() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Login/OpsAlphaLoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('I already logged in the system')
	def I_already_logged_in_the_system () {
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/The Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/Login with username and encrypted password'), [('username') : GlobalVariable.username
			, ('encryptedPassword') : GlobalVariable.encrypted_password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Dashboard Page/The Dashboard Page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I enter gmail login')
	def I_enter_gmail_login() {
		WebUI.callTestCase(findTestCase('Test Cases/Guest EX/Cucumber Features Steps/OPS Web/Common/EnterGmailLogin'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I login the system with "(.*)" username and invalid "(.*)" password')
	def I_login_the_system_with_invalid_password(String username, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Login Page/Login with invalid password'), [('username') : username
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}
}