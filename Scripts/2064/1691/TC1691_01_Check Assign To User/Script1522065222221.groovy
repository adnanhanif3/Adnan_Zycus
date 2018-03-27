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

WebUI.comment('Verify assign to single user')

WebUI.callTestCase(findTestCase('Common TC/Ronaldo Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Temp workaround to close API error popup'
WebUI.click(findTestObject('Page_Home/Overview/btn_Alert Close'), FailureHandling.CONTINUE_ON_FAILURE)

'Temp workaround to close API error popup'
WebUI.click(findTestObject('Page_Home/Overview/btn_Alert Close'), FailureHandling.CONTINUE_ON_FAILURE)

'Temp workaround to close API error popup'
WebUI.delay(4)

WebUI.click(findTestObject('Page_Home/Procurement Services/btn_CreateNow2'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Test AssignTO by Katalon')

WebUI.click(findTestObject('Page_Create Request/btn_UrgentYes'))

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Loreum Ipsum')

WebUI.sendKeys(findTestObject('Page_Create Request/drpdown_AssignTo'), 'Lio')

WebUI.click(findTestObject('Page_Create Request/drpdown_LioMessi'))

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.delay(10)

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_Service request/btn_ViewRequest1'))

WebUI.verifyElementText(findTestObject('Page_View request/txt_AssignToName'), 'Lio Messi')

