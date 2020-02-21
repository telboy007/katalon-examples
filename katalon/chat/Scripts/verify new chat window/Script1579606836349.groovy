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

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat)/div_Chat for Property nnn'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat)/new chat window - previous messages'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat)/new chat window - new message'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat)/button_Resolve'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_Hostmaker Chat (new chat)/div_Send'), 0)

WebUI.setText(findTestObject('Page_Hostmaker Chat (new chat)/new chat window - new message'), 'test')

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat)/div_Send'), 0)

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat)/div_Send'))

WebUI.verifyElementText(findTestObject('Page_Hostmaker Chat (new chat)/Page_Hostmaker Chat (first message)/first chat message'), 
    'test')

WebUI.verifyElementText(findTestObject('Page_Hostmaker Chat (new chat)/Page_Hostmaker Chat (first message)/first chat sender'), 
    'NT')

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat)/button_Resolve'))

