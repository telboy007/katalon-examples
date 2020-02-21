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

'take cash payment for city tax'
Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/City Tax/Adults plus'), 0)

Mobile.tap(findTestObject('Mobile app/WW Flow/City Tax/Children plus'), 0)

Mobile.setText(findTestObject('Mobile app/WW Flow/android.widget.EditText0'), '14', 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/City Tax/PAY'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/City Tax/Payment method - The guest doesnt have any card'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/City Tax/Cash payment confirmation  - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile app/WW Flow/City Tax/NEXT'), 0)