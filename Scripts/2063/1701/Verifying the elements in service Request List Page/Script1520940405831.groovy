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

WebUI.mouseOver(findTestObject('Page_Service request/My request xpath'))

WebUI.click(findTestObject('Page_Service request/Service request xpath'))

WebUI.delay(10)

WebUI.check(findTestObject('Page_Home/Menu Nav/Service Requests -number of X requests'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Search all requests -search box'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Add Filter click'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Request Number'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Request name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Submitted on'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Status'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Request definition'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/Requets type'), 0)

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.closeBrowser()

