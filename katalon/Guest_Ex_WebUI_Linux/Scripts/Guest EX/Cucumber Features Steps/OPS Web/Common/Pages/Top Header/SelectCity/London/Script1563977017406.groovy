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

WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Home Page/element_sidebar_Services'), 3)

WebUI.click(findTestObject('OPS Web/Common/Top Header/button_city_select'))

if (WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Top Header/menu_item_All'), 3) == true) {
    WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_All'))

    WebUI.click(findTestObject('OPS Web/Common/Top Header/menu_item_All'))

    WebUI.click(findTestObject('OPS Web/Common/Top Header/button_city_select'))

    if (WebUI.verifyElementVisible(findTestObject('OPS Web/Common/Top Header/menu_item_London')) == true) {
        WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Top Header/menu_item_London'), 3)

        WebUI.click(findTestObject('OPS Web/Common/Top Header/menu_item_London'))
    } else {
        FailureHandling.STOP_ON_FAILURE
    }
} else {
    WebUI.waitForElementClickable(findTestObject('OPS Web/Common/Top Header/menu_item_London'), 3)

    WebUI.click(findTestObject('OPS Web/Common/Top Header/menu_item_London'))
}

