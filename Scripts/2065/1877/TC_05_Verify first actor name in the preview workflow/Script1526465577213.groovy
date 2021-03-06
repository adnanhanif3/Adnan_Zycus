import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Verify first actor in preview workflow')

WebUI.callTestCase(findTestCase('Common TC/Login To irequest portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'Test email Notification')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Test_FirstActor_Name')

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Testing Name of first actor')

WebUI.delay(2)

String userName = WebUI.getText(findTestObject('Page_View request/User Name'))

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.waitForElementPresent(findTestObject('Page_Create Request/icon_Close'), 30)

WebUI.click(findTestObject('Page_Create Request/icon_Close'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_Service request/btn_ViewRequest1'))

WebUI.verifyElementText(findTestObject('Page_View request/Requester Name'), userName)

WebUI.closeBrowser()

