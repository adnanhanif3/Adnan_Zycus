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

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/HOME'), 0)

WebUI.verifyElementText(findTestObject('Page_Home/Menu Nav/HOME'), 'HOME')

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/To Dos'), 0)

WebUI.verifyElementText(findTestObject('Page_Home/Menu Nav/To Dos'), 'TO DO\'S')

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/MY REQUESTS'), 0)

WebUI.verifyElementText(findTestObject('Page_Home/Menu Nav/MY REQUESTS'), 'MY REQUEST')

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/HELP DESK'), 0)

WebUI.verifyElementText(findTestObject('Page_Home/Menu Nav/HELP DESK'), 'HELP DESK')

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/HOME Highlighted'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/TO DOs arrow'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/MY REQUESTS arrow'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Menu Nav/HELP DESK arrow'), 0)

WebUI.closeBrowser()

