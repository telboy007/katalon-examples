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

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/element_Home-property_Image'), 
    6)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/element_home_heading'), 
    3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/element_hostmaker_logo'), 
    3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/WhatToDo/element_what_to_do_rome'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/label_success_saved'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/link_Update check-in info'), 
    3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Check-in'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Check-out'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_House Manual'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/EmailAndPhone/text_phone_rome'), 
    3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_powered by Tiqets'), 
    3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/EmailAndPhone/text_email_rome'), 
    3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_support_centre'), 3)

