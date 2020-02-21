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

WebUI.openBrowser('https://scheduling-staging.hostmaker.co/')

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Signin/span_Continue with Google'))

WebUI.setText(findTestObject('Object Repository/Scheduling/Page_Sign in  Google accounts/input_hostmakerco_identifier'), 
    'terry@hostmaker.co')

WebUI.sendKeys(findTestObject('Object Repository/Scheduling/Page_Sign in  Google accounts/input_hostmakerco_identifier'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(10)

WebUI.switchToWindowTitle('Scheduling Tool')

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_Toggle navigation_fa fa-lock'))

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_ W14 - 5617 - Genevieve Ziemann - 3 Archel Road London UK'))

WebUI.mouseOver(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_ W14 - 5617 - Genevieve Ziemann - 3 Archel Road London UK'))

WebUI.rightClick(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_ W14 - 5617 - Genevieve Ziemann - 3 Archel Road London UK'))

WebUI.waitForElementPresent(findTestObject('Scheduling/Page_Scheduling Tool/span_Assign to'), 5)

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_Assign to'))

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_N'))

WebUI.click(findTestObject('Object Repository/Scheduling/Page_Scheduling Tool/span_Not Terry3 Bonds'))

