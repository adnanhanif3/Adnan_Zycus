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

WebUI.callTestCase(findTestCase('2064/1695/TC1695_01_Save as Draft'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Service request/Inprogress deselect'))

WebUI.click(findTestObject('Page_Service request/Returned deselect '))

WebUI.click(findTestObject('Page_Service request/With RM deselect '))

WebUI.click(findTestObject('Page_Service request/Awatting approval deselect '))

WebUI.click(findTestObject('Page_Service request/Rejected deselect '))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Service request/Edit request button(Draft)'))

WebUI.click(findTestObject('Page_Edit request/Requestdescp_field'))

WebUI.sendKeys(findTestObject('Page_Edit request/Requestdescp_field'), 'Need the requirement as early as possible.')

WebUI.click(findTestObject('Page_Edit request/Btn_Submit'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Page_Service request/View Request'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Page_View request/requestdect data'), 'Loreum IpsumNeed the requirement as early as possible.')

WebUI.delay(5)

WebUI.closeBrowser()
