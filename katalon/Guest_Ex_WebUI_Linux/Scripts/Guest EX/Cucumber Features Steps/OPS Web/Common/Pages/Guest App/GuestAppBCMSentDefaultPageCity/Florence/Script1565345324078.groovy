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

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Arrival notes'), 6, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/label_Business  work'), 6)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/button_stay_details'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/button_Submit check-in information'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/Cities Check-ins/Guest_App_CheckinTime_Florence'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/Cities Check-ins/Guest_App_CheckOutTime_Florence'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/label_Leisure'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/label_Special Occasion'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_CarTaxi'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_check-in'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Check-in is available from 3pm'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_check-out'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Check-out time'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Meet N Greet'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Plane'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Public Transport'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/text_Reason for the trip'), 3)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/CheckIn/textarea_arrivalNotes'), 3)

