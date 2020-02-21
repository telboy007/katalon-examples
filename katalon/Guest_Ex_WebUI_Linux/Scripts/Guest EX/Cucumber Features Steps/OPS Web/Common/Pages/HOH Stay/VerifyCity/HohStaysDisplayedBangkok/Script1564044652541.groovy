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

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/input_search field'), 3)

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/pagetitle_Total_hoh_stays'), 3)

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/button_expand search'), 3)

if (WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/CitiesElements/element_id_Bangkok'), 2) == false && 

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/CitiesElements/elemenet_timezone_Bangkok'), 2) == false) 
{
	WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/page_element_no_stays'), 3) == true
	
	WebUI.click(findTestObject('OPS Web/Common/HOH Stay/field_check_in_check_out_dates'))
	
	WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/dropdown_Datesby_Before_Checkin'), 3)
	
	WebUI.click(findTestObject('OPS Web/Common/HOH Stay/dropdown_Datesby_Before_Checkin'))
	
	WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/button_Search'), 3)
	
	WebUI.click(findTestObject('OPS Web/Common/HOH Stay/button_Search'))
	
	WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/CitiesElements/element_id_Bangkok'),
		3)
	
	WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/CitiesElements/elemenet_timezone_Bangkok'),
		3)
	
}
