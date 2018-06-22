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

WebUI.callTestCase(findTestCase('Common TC/Ronaldo Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'ADN_WFD')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Test Assign To User group')

WebUI.click(findTestObject('Page_Create Request/btn_UrgentYes'))

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Checking Assign to user group functionality')

WebUI.scrollToElement(findTestObject('Page_Create Request/icon_AssignTo'), 3)

WebUI.click(findTestObject('Page_Create Request/icon_AssignTo'))

WebUI.click(findTestObject('Page_Create Request/drpdwn_AssignToGrp'))

WebUI.sendKeys(findTestObject('Page_Create Request/drpdown_AssignTo'), 'Dew')

WebUI.click(findTestObject('Page_Create Request/drpdwn_GrpDewdrop'))

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.waitForElementPresent(findTestObject('Page_Create Request/icon_Close'), 30)

WebUI.click(findTestObject('Page_Create Request/icon_Close'))

WebUI.click(findTestObject('Page_Service request/View Request'))

WebUI.verifyElementText(findTestObject('Page_View request/txt_AssignToName'), 'Dewdrops')

WebUI.closeBrowser()

