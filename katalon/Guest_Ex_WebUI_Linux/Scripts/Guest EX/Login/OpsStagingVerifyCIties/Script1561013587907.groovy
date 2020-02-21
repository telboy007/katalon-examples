import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.OPSStaginURL)

WebUI.click(findTestObject('OPS Web/Common/Gmail login/button_login with hostmaker'))

WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Gmail login/button_Continue with Google'), 4, FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('OPS Web/Common/Gmail login/button_Continue with Google'))

WebUI.click(findTestObject('OPS Web/Common/Gmail login/button_Continue with Google'))

WebUI.setText(findTestObject('Gmail/Page_Gmail/Fields/field_email'), GlobalVariable.OPSStagingUser2)

WebUI.click(findTestObject('Gmail/Page_Gmail/Buttons/button_next'))

WebUI.waitForElementVisible(findTestObject('Gmail/Page_Gmail/Fields/field_password'), 4, FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Gmail/Page_Gmail/Fields/field_password'), GlobalVariable.OPSStagingPass2)

WebUI.click(findTestObject('Gmail/Page_Gmail/Buttons/button_password_next'))

WebUI.waitForPageLoad(15, FailureHandling.STOP_ON_FAILURE)


WebUI.waitForElementClickable(findTestObject('OpsStaging/Page_Hostmaker Ops/Page Elements/element_sidebar_Services'), 0)

WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Home Page/element_sidebar_Services'), 2)

WebUI.click(findTestObject('OPS Web/Common/Top Header/button_city_select'))

WebUI.waitForElementPresent(findTestObject('OPS Web/Common/Top Header/dropdown_city_select'), 4)

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_London'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Barcelona'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Madrid'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Paris'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Rome'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Lisbon'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Florence'))

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Cannes'))

WebUI.callTestCase(findTestCase('Guest EX/Cucumber Features Steps/Additional Steps/Check Console Errors'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_Bangkok'))

