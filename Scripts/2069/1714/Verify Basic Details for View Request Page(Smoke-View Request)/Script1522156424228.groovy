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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common TC/Create Request With Basic Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Page_Service request/View Request'))

WebUI.verifyElementText(findTestObject('Page_View request/Basic Details Request Number'), 'Request Number')

WebUI.verifyElementText(findTestObject('Page_View request/Basic Details Request Definition'), 'Request Definition', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_View request/Basic Details Request Type'), 'Request Type', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_View request/Basic Details Urgent Requirement'), 'Urgent Requirement', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_View request/Basic Details Request Description'), 'Request Description', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_View request/Basic Details Attachments'), 'Attachments', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_View request/WorkFlow_Field'), 'Workflow')

WebUI.verifyElementText(findTestObject('Page_View request/Activity Tab'), 'Activity')

WebUI.closeBrowser()

