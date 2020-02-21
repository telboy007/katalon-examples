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

Mobile.setText(findTestObject('android.widget.EditText0 - Email'), 'terry@hostmaker.co', 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Log in'), 0)

if (Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 1, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('android.widget.ImageView0'), 0)
}
	
if (Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.Button0 - Continue with Google'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/android.widget.Button0 - Continue with Google'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Object Repository/Google login - Terry Bonds terryhostmaker.co'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Google login - Terry Bonds terryhostmaker.co'), 0)
}

