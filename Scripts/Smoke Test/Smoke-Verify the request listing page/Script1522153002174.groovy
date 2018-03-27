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

WebUI.click(findTestObject('Home page error handling repo/Error1'))

WebUI.click(findTestObject('Home page error handling repo/Error2'))

WebUI.click(findTestObject('Page_Service request/Requests Verifying'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Service request/Requests Verifying'), '')

WebUI.mouseOver(findTestObject('Page_Service request/My request xpath'))

WebUI.click(findTestObject('Page_Service request/Service request xpath'))

WebUI.verifyElementPresent(findTestObject('Page_Service request/Search allrequests'), 0)

WebUI.verifyElementPresent(findTestObject('Page_View request/Verifyu Request Number'), 0)

WebUI.verifyElementPresent(findTestObject('Page_View request/Verify Request NAme'), 0)

WebUI.verifyElementPresent(findTestObject('Page_View request/Verify Request Definition'), 0)

WebUI.verifyElementPresent(findTestObject('Page_View request/Verify Request Type'), 0)

WebUI.verifyElementPresent(findTestObject('Page_View request/Verify Submitted On'), 0)

WebUI.verifyElementPresent(findTestObject('Page_View request/Verify View'), 0)

WebUI.closeBrowser()
