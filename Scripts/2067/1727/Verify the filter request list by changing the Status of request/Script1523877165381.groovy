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

WebUI.callTestCase(findTestCase('Common TC/Login To irequest portal'), [:])

WebUI.click(findTestObject('Page_Approval Listing/Pending_approvals'))

WebUI.delay(1)

text = WebUI.getText(findTestObject('Page_Approval Listing/request_numbervalue'))

WebUI.click(findTestObject('Page_Approval Listing/Approve_BTN'))

WebUI.click(findTestObject('Page_Approval Listing/txtarea_ApprovalComment'))

WebUI.sendKeys(findTestObject('Page_Approval Listing/txtarea_ApprovalComment'), 'Approved')

WebUI.click(findTestObject('Page_Approval Listing/Comment_approvebtn'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.click(findTestObject('Page_Approval Listing/Defaultfilter_approval'))

WebUI.click(findTestObject('Page_Service request/Filter button'))

WebUI.click(findTestObject('Page_Approval Listing/btn_Approved_Filter'))

WebUI.click(findTestObject('Page_Service request/Service request button'))

WebUI.verifyElementText(findTestObject('Page_Approval Listing/request_numbervalue'), text)

WebUI.closeBrowser()

