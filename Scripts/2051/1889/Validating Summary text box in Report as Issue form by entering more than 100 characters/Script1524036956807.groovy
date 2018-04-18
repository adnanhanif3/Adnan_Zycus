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

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/Module'))

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/Module-Approvals'))

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/MessageType'))

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/MessageType_FunctionalityIssue'))

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/Priority'))

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/Priority_High'))

WebUI.setText(findTestObject('Page_ReportAnIssuePopUp/Summary'), 'this is more than 100 char string this is more than 100 char string this is more than 100 char string ')

WebUI.setText(findTestObject('Page_ReportAnIssuePopUp/Description'), 'Test')

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/Submit'))

WebUI.delay(5)

Text = WebUI.getText(findTestObject('Page_ReportAnIssuePopUp/ConfirmationPanel'))

WebUI.verifyMatch(Text, 'Issue Submitted', false)

WebUI.closeBrowser()

