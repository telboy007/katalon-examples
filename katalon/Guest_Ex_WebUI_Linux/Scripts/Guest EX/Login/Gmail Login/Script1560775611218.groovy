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
import java.util.logging.Handler
import java.util.logging.Level
import java.util.logging.Logger


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.GmailURL)

WebUI.waitForPageLoad(3)

WebUI.verifyElementVisible(findTestObject('Gmail/Page_Gmail/Page Elements/google_logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Gmail/Page_Gmail/Fields/field_email'), GlobalVariable.GmailUser)

WebUI.click(findTestObject('Gmail/Page_Gmail/Buttons/button_next'))

WebUI.waitForPageLoad(3)

WebUI.waitForElementPresent(findTestObject('Gmail/Page_Gmail/Fields/field_password'), 
    3)

WebUI.waitForElementPresent(findTestObject('Gmail/Page_Gmail/Dropdowns/dropdown_Gmailprofile'), 
    3)

WebUI.verifyElementVisible(findTestObject('Gmail/Page_Gmail/Dropdowns/dropdown_Gmailprofile'))

WebUI.verifyElementVisible(findTestObject('Gmail/Page_Gmail/Fields/field_password'))

WebUI.focus(findTestObject('Gmail/Page_Gmail/Fields/field_password'))

WebUI.setEncryptedText(findTestObject('Gmail/Page_Gmail/Fields/field_password'), GlobalVariable.GmailPassword)

WebUI.click(findTestObject('Gmail/Page_Gmail/Buttons/button_next'))

WebUI.waitForPageLoad(3)

WebUI.waitForElementVisible(findTestObject('Gmail/Page_Gmail/Buttons/button_Profile_Pic'), 
    5)

