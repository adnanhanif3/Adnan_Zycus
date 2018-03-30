import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('2064/1695/TC1695_01_Save as Draft'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Service request/Edit request button(Draft)'))

WebUI.click(findTestObject('Page_Edit request/Request_description'))

WebUI.sendKeys(findTestObject('Page_Edit request/Requestdescp_field'), ' Testing the edit option')

WebUI.click(findTestObject('Page_Edit request/Btn_Submit'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_Service request/View Request'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Page_View request/requestdect data'), 'Loreum Ipsum Testing the edit option')

WebUI.delay(5)

WebUI.closeBrowser()

