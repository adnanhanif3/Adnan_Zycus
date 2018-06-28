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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Approval Listing/Pending_approvals'))

WebUI.click(findTestObject('Page_Approval Listing/Defaultfilter_approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Service request/Filter button'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Approval Listing/btn_Approved_Filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Service request/Filter View Service Request'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_Approval Listing/Btn_viewdetails'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_View request/WF Status Approver'), 'Approved')

WebUI.verifyElementText(findTestObject('Page_View request/Comments'), 'Comments')

WebUI.closeBrowser()

