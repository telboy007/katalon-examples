import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Rome billing page 1'
Mobile.clearText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - first name field'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - first name field'), 'Guest', 0)

Mobile.clearText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - last name field'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - last name field'), 'Person', 0)

Mobile.clearText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - address field'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - address field'), 'Rome road', 0)

Mobile.clearText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - city field'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - city field'), 'Rome', 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - post code field'), '08000', 0)

Mobile.scrollToText('BACK', FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - residence country field'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - residence country field'), 'ital', 0)

Mobile.tap(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - auto complete country popup'), 0)

Mobile.clearText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - email field'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - email field'), 'tech.test@hostmaker.co', 
    0)

Mobile.tap(findTestObject('Mobile app/WW Flow/Billing Page (Rome only)/P1 - NEXT button'), 0)

