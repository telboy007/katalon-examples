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

WebUI.click(findTestObject('Page_Hostmaker Chat (logged in)/New chat plus icon'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat reason'))

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat reason list/span_Alien Invasion'), 
    0)

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat reason list/span_Alien Invasion'))

WebUI.setText(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat property id'), prod_id)

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat property lookup/1st property result'), 
    0)

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat property lookup/1st property result'))

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat participants'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Hostmaker Chat (new chat dialog)/input_Who should be in the chat_search'), name)

WebUI.verifyElementPresent(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat participants lookup/first name result'), 
    0)

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/new chat participants lookup/first name result'))

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/i_Who should be in the chat_dropdown icon'))

WebUI.click(findTestObject('Page_Hostmaker Chat (new chat dialog)/button_Submit'))

WebUI.waitForPageLoad(0)

