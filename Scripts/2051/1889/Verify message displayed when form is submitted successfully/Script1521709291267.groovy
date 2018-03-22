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

WebUI.setText(findTestObject('Page_ReportAnIssuePopUp/Summary'), 'I am not able to submit a request')

WebUI.setText(findTestObject('Page_ReportAnIssuePopUp/Description'), '404 error message is encountered.')

WebUI.delay(5)

not_run: WebUI.uploadFile(findTestObject('Page_ReportAnIssuePopUp/AttachmentField'), 'Data Files\\\\App Test Data\\\\FilesToUpload\\\\TextFile')

WebUI.delay(5)

WebUI.click(findTestObject('Page_ReportAnIssuePopUp/Submit'))

AlertText = WebUI.getAlertText()

WebUI.verifyMatch(AlertText, 'Submitting the issue', false)

