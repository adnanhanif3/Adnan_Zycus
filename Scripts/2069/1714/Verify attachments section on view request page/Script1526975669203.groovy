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

WebUI.callTestCase(findTestCase('Common TC/Login To irequest portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'ADN_WFD')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Test Attachment Section')

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Testing Attachment section')

String userDir = System.getProperty('user.dir')

String filePath = (userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\eCatalogue_User_Guides.pdf'

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(9)

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.waitForElementPresent(findTestObject('Page_Create Request/icon_Close'), 20)

WebUI.click(findTestObject('Page_Create Request/icon_Close'))

WebUI.click(findTestObject('Page_Service request/btn_ViewRequest1'))

WebUI.verifyElementText(findTestObject('Page_View request/Attachment Name'), 'eCatalogue_User_Guid...')

WebUI.verifyElementText(findTestObject('Page_View request/Attachment Size'), '288.63kb')

WebUI.verifyElementText(findTestObject('Page_View request/Download Attachment'), 'Download')

WebUI.delay(4)

WebUI.closeBrowser()

