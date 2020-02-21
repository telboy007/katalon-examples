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

WebUI.waitForPageLoad(15, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('OPS Web/Staging/element_label_staging'), 4)

WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Home Page/element_sidebar_Services'), 0)

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/input_search field'), 3)

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/Properties/pagetitle_Add New Property'), 3)

WebUI.waitForElementVisible(findTestObject('OPS Web/Common/HOH Stay/button_expand search'), 3)

