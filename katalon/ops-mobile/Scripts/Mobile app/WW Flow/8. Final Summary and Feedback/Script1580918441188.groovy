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

'Get device screen size'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.70

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/how were guests drop down'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/how were guests - Nice  friendly'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/check-in issues - no'), 0)

while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/Special requests (optional)'), 1, FailureHandling.OPTIONAL)) {
	Mobile.swipe(startX, endY, endX, startY)
}

Mobile.tap(findTestObject('Mobile app/WW Flow/Final summary and feedback/cleanliness rating - 5 star'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/rate property - drop down'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/rate property - Good condition'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/Final summary and feedback/COMPLETE SERVICE'), 0)

'give it time to submit service details'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
