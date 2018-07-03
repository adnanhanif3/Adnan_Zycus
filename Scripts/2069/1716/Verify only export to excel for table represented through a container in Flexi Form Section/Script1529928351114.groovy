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

WebUI.click(findTestObject('Page_Home/Top Nav/Globalsearch_box'))

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'ADN_Test_FF')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'TestFF')

WebUI.scrollToElement(findTestObject('Page_Edit request/Flexiform_fields/Text_field'), 4)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Text_field'), 'Test1')

WebUI.scrollToElement(findTestObject('Page_Edit request/Flexiform_fields/Flexi_Attachment'), 4)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Eventcurrency_table'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Eventcurrencyvalue1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Pricetype_table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Pricetype1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Unitmeasure'), 'KG', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Itemnumber'), '4512', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Quantity'), '100', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Itemname'), 'Notebook', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Flexisave_table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.click(findTestObject('Page_Service request/View Request'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Page_View request/FlexiForm/Table/Export to Excel'), 5)

WebUI.verifyElementText(findTestObject('Page_View request/FlexiForm/Table/Export to Excel'), 'Export to Excel')

WebUI.closeBrowser()

