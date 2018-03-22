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

WebUI.mouseOver(findTestObject('Page_Home/Menu Nav/HELP DESK'))

WebUI.click(findTestObject('Page_Home/Menu Nav/ReportAnIssue'))

WebUI.verifyElementText(findTestObject('Page_ReportAnIssuePopUp/ModuleLbl'), 'Module')

WebUI.verifyElementPresent(findTestObject('Page_ReportAnIssuePopUp/Module'), 0)

WebUI.verifyElementText(findTestObject('Page_ReportAnIssuePopUp/MessageTypeLbl'), 'Message Type')

WebUI.verifyElementPresent(findTestObject('Page_ReportAnIssuePopUp/MessageType'), 0)

WebUI.verifyElementText(findTestObject('Page_ReportAnIssuePopUp/PriorityLbl'), 'Priority')

WebUI.verifyElementPresent(findTestObject('Page_ReportAnIssuePopUp/Priority'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ReportAnIssuePopUp/Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ReportAnIssuePopUp/Description'), 0)

WebUI.verifyElementText(findTestObject('Page_ReportAnIssuePopUp/AddAttachmentLbl'), 'Add Attachments')

WebUI.verifyElementPresent(findTestObject('Page_ReportAnIssuePopUp/Browse'), 0)

WebUI.verifyElementClickable(findTestObject('Page_ReportAnIssuePopUp/Browse'))

