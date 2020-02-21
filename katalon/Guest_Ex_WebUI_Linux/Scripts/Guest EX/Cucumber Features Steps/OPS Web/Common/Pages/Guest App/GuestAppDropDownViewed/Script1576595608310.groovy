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

WebUI.click(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/button_Getting to the property'))

WebUI.click(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/button_House Rules'))

WebUI.click(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/button_Parking Information'))

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/element_google_maps_property'), 
    1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/element_parking_info'), 
    1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Tips_access_property'), 
    1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Maximum_Guests'), 1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Parties_not_allowed'), 
    1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Suitable_for_children'), 
    1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Suitable_infants'), 
    1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_No_smoking'), 1)

WebUI.verifyElementPresent(findTestObject('OPS Web/Common/GuestApp/ConfirmedPage/Page_Hostmaker/text_Not_suitable_for_pets'), 
    1)

