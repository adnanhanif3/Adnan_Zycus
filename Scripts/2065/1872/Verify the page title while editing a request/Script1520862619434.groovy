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

WebUI.openBrowser('http://test.irequest.zycus.net/#/irequest/home')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Login credentials/Username xpath'), 'testqa1@zycat.com')

WebUI.sendKeys(findTestObject('Login credentials/Password xpath'), 'Test@123')

WebUI.click(findTestObject('Login credentials/Login button xpath'))

WebUI.mouseOver(findTestObject('Page_Service request/My request xpath'))

WebUI.click(findTestObject('Page_Service request/Service request xpath'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Service request/Filter button'))

WebUI.click(findTestObject('Page_Service request/Draft status'))

WebUI.click(findTestObject('Page_Service request/Service request button'))

WebUI.delay(3)

text = WebUI.getText(findTestObject('Verify the page title/Get text(req name) for page title verfy'))

WebUI.click(findTestObject('Page_Service request/Edit request button'))

WebUI.verifyElementText(findTestObject('Verify the page title/Page title xpath'), text)

