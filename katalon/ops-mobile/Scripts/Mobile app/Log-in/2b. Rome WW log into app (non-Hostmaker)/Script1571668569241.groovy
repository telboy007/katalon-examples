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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.setText(findTestObject('Mobile app/android.widget.EditText0 - Email'), 'wigja@blueyonder.co.uk', 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Log in'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'handle factory reset remote devices with chrome sign-up flow showing'
if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - ACCEPT  CONTINUE'), 
    1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - usage checkbox'), 0)

    Mobile.tap(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - ACCEPT  CONTINUE'), 0)

	if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - sign-in - NO THANKS'),
		1, FailureHandling.OPTIONAL)) {
    	Mobile.tap(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - sign-in - NO THANKS'), 
        0)
	}
		
	if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - sign-in - NO THANKS (lower case)'),
		1, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('Object Repository/Mobile app/Factory reset/chrome - factory reset - sign-in - NO THANKS (lower case)'),
		0)
	}
}

'continue with normal log in flow'
if (Mobile.verifyElementExist(findTestObject('Mobile app/android.widget.ImageView0'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile app/android.widget.ImageView0'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Mobile app/Log-in/Social sign in/Social sign in - username'), 1, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Mobile app/Log-in/Social sign in/Social sign in - username'), 'wigja@blueyonder.co.uk', 
        0)

    Mobile.setText(findTestObject('Mobile app/Log-in/Social sign in/Social sign in - password'), 'password12345', 0)

    Mobile.tap(findTestObject('Mobile app/Log-in/Social sign in/Social sign in - submit'), 0)
}

if (Mobile.verifyElementExist(findTestObject('android.widget.TextView0 - Log in'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('android.widget.TextView0 - Log in'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Mobile app/android.widget.ImageView0'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile app/android.widget.ImageView0'), 0)
}

if (Mobile.verifyElementExist(findTestObject('android.widget.TextView0 - Log in'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('android.widget.TextView0 - Log in'), 0)
}

