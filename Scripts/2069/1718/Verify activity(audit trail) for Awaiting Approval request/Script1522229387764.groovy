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

WebUI.click(findTestObject('Page_Service request/Requests list on homepage'))

WebUI.click(findTestObject('Page_Service request/Inprogress deselect'))

WebUI.click(findTestObject('Page_Service request/Returned deselect '))

WebUI.click(findTestObject('Page_Service request/With RM deselect '))

WebUI.click(findTestObject('Page_Service request/Rejected deselect '))

WebUI.click(findTestObject('Page_Service request/Draft deselect'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Service request/View Request'))

WebUI.verifyElementPresent(findTestObject('Page_View request/Activity Tab'), 5)

WebUI.click(findTestObject('Page_View request/Activity Tab'))

WebUI.delay(2)

WebUI.closeBrowser()

