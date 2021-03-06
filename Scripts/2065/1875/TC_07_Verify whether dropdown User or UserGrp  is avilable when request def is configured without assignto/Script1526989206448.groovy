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

WebUI.comment('Verify assign to single user')

WebUI.callTestCase(findTestCase('Common TC/Login To irequest portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'AssignTo :Don\'t allow Requester to Assign Request to Request Manager')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Test AssignTO by Katalon')

WebUI.click(findTestObject('Page_Create Request/btn_UrgentYes'))

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Loreum Ipsum')

WebUI.click(findTestObject('Page_Create Request/btn_SaveasDraft'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.click(findTestObject('Page_Service request/Edit request button(Draft)'))

WebUI.verifyElementNotPresent(findTestObject('Page_Create Request/icon_AssignTo'), 30)

WebUI.verifyElementNotPresent(findTestObject('Page_Create Request/drpdwn_AssignTo User'), 30)

WebUI.verifyElementNotPresent(findTestObject('Page_Create Request/drpdwn_AssignToGrp'), 30)

WebUI.closeBrowser()

