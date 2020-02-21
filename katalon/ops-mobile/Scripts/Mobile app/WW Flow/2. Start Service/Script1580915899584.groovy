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

'Start service'
Mobile.scrollToText('START SERVICE', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile app/WW Flow/android.widget.TextView0 - START SERVICE'), 0)

'handle early starts of events'
if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile app/HK flow/HK event P1 early start - YES'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Mobile app/HK flow/HK event P1 early start - YES'), 0)
}

'handle location services permission'
if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile app/Location services permissions/Location services - ALLOW'), 1, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Object Repository/Mobile app/Location services permissions/Location services - ALLOW'), 0)
}