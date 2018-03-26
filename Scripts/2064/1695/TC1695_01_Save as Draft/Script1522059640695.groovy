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

WebUI.comment('Verify Save as Draft')

WebUI.callTestCase(findTestCase('Common TC/Ronaldo Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Temp workaround to close API error popup'
WebUI.click(findTestObject('Page_Home/Overview/btn_Alert Close'), FailureHandling.CONTINUE_ON_FAILURE)

'Temp workaround to close API error popup'
WebUI.click(findTestObject('Page_Home/Overview/btn_Alert Close'), FailureHandling.CONTINUE_ON_FAILURE)

'Temp workaround to close API error popup'
WebUI.delay(4)

WebUI.click(findTestObject('Page_Home/Procurement Services/btn_CreateNow1'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'New request saved as draft')

WebUI.click(findTestObject('Page_Create Request/btn_UrgentYes'))

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Loreum Ipsum')

WebUI.click(findTestObject('Page_Create Request/btn_SaveasDraft'))

WebUI.delay(10)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Service request/txt_RequestNameTile1'), 'New request saved as draft')

