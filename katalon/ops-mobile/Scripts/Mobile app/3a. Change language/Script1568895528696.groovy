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

if (Mobile.verifyElementExist(findTestObject('android.widget.Button0 - Allow'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('android.widget.Button0 - Allow'), 0)
}

Mobile.tap(findTestObject('Mobile app/Bottom Nav/Settings'), 0)

Mobile.tap(findTestObject('Mobile app/Bottom Nav/Settings Objects/Change language'), 0)

Mobile.tap(findTestObject('Mobile app/Bottom Nav/Settings Objects/Change langauge objects/Change language - drop down'), 0)

Mobile.tap(findTestObject('Mobile app/Bottom Nav/Settings Objects/Change langauge objects/Change language - drop down - missing en.Romanian translation'), 0)

Mobile.tap(findTestObject('Mobile app/Bottom Nav/Settings Objects/Change langauge objects/Change language - SUBMIT'), 0)

Mobile.tap(findTestObject('Mobile app/Bottom Nav/Schedule'), 0)

