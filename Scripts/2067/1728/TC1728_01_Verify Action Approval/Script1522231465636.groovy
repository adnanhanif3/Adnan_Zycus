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

WebUI.comment('Verify the action Approval')

WebUI.callTestCase(findTestCase('Common TC/Diego Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Approval Listing/tab_Approvals'))

String RequestNumber = WebUI.getText(findTestObject('Page_Approval Listing/txt_RequestNumber1'))

WebUI.click(findTestObject('Page_Approval Listing/link_ApproveCard1'))

WebUI.sendKeys(findTestObject('Page_Approval Listing/txtarea_ApprovalComment'), 'Approved by Katalon')

WebUI.click(findTestObject('Page_Approval Listing/btn_Approve In Comment Window'))

WebUI.delay(10)

WebUI.acceptAlert()

WebUI.delay(4)

WebUI.click(findTestObject('Page_Approval Listing/btn_AddFilter'))

WebUI.click(findTestObject('Page_Approval Listing/btn_InApproval_Filter'))

WebUI.click(findTestObject('Page_Approval Listing/btn_Approved_Filter'))

WebUI.click(findTestObject('Page_Approval Listing/btn_ViewApprovals'))

WebUI.verifyElementText(findTestObject('Page_Approval Listing/txt_RequestNumber1'), RequestNumber)

