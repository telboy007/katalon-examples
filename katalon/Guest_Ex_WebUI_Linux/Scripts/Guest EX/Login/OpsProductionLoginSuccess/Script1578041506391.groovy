import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl(GlobalVariable.OPSProdURL)

WebUI.click(findTestObject('OPS Web/Common/Gmail login/button_login with hostmaker'))

WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Gmail login/button_Continue with Google'), 4, FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('OPS Web/Common/Gmail login/button_Continue with Google'))

WebUI.click(findTestObject('OPS Web/Common/Gmail login/button_Continue with Google'))

WebUI.setText(findTestObject('Gmail/Page_Gmail/Fields/field_email'), GlobalVariable.OPSStagingUser2)

WebUI.click(findTestObject('Gmail/Page_Gmail/Buttons/button_next'))

WebUI.waitForElementVisible(findTestObject('Gmail/Page_Gmail/Fields/field_password'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Gmail/Page_Gmail/Fields/field_password'), GlobalVariable.OPSStagingPass2)

WebUI.delay(1)

WebUI.click(findTestObject('Gmail/Page_Gmail/Buttons/button_password_next'))

WebUI.waitForPageLoad(15, FailureHandling.STOP_ON_FAILURE)

