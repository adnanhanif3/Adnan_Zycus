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

WebUI.callTestCase(findTestCase('Common TC/Ronaldo Login'), [:])

WebUI.click(findTestObject('Page_Home/Top Nav/Globalsearch_box'))

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'ADN_Test_FF')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Testdewdrops')

WebUI.delay(15)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Textarea_field'), 'Test')

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Numeric_field'), '24')

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Radiobtn'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Checkbox1'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Checkbox2'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Dropdown1'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Dropdown1_value'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Dropdown2'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Dropdown2_value'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Date-time_field'))

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Month_field'))

WebUI.selectOptionByValue(findTestObject('Page_Edit request/Flexiform_fields/Month_field'), '5', false)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Year_field'))

WebUI.selectOptionByValue(findTestObject('Page_Edit request/Flexiform_fields/Year_field'), '2015', false)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Day_selecter'))

String userDir = System.getProperty('user.dir')

String filePath = (userDir + '\\') + 'git\\iRequestAutomation\\Data Files\\App Test Data\\FilesToUpload\\iRequest_User_Manual'

WebUI.uploadFile(findTestObject('Page_Edit request/Flexiform_fields/Flexi_Attachment'), filePath)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Eventcurrency_table'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Eventcurrencyvalue1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Pricetype_table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Pricetype1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Unitmeasure'), 'KG', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Itemnumber'), '123', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Quantity'), '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Edit request/Flexiform_fields/Itemname'), 'Notebook', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Flexisave_table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.closeBrowser()

