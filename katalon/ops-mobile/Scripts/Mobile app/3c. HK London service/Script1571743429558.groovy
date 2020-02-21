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

Mobile.tap(findTestObject('Mobile app/android.view.ViewGroup0 (1)'), 0)

Mobile.scrollToText('START SERVICE', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile app/HK flow/HK event P1 - START SERVICE'), 0)

'handle early starts of events'
if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile app/HK flow/HK event P1 early start - YES'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Mobile app/HK flow/HK event P1 early start - YES'), 0)
}

'new keys scan screen - skip kay scans for now'
Mobile.scrollToText('NEXT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile app/HK flow/HK event P2 - NEXT'), 0)

'hows the house'
Mobile.tap(findTestObject('Mobile app/HK flow/HK event P3 - 5th star'), 0)

Mobile.setText(findTestObject('Mobile app/android.widget.EditText0 (1)'), 'test', 0)

Mobile.scrollToText('NEXT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile app/HK flow/HK event P3 - NEXT'), 0)

'dont scroll to skip, skip will have inconsistent text (number of checkboxes)'
Mobile.scrollToText('BACK', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/HK flow/HK event P4 - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/HK flow/HK event P4 skip - NEXT'), 0)

Mobile.tap(findTestObject('Mobile app/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Mobile app/android.widget.TextView0 -  (1)'), 0)

Mobile.scrollToText('DONE', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Mobile app/HK flow/HK event P5 - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/HK flow/HK event P5 - DONE'), 0)

