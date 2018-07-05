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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common TC/Login To irequest portal'), [:])

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'ADN_Test_FF')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Testdewdrops')

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Page_Edit request/Flexiform_fields/Text_field'), 1)

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Flexi_Attachment'))

WebUI.switchToFrame(findTestObject('Page_Edit request/Flexiform_fields/iFrame'), 5)
String userDir = System.getProperty('user.dir')

String filePath = (userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\eCatalogue_User_Guides.pdf'

CustomKeywords.'customKeywords.Uploadfile.uploadFile'(findTestObject('Page_Edit request/Flexiform_fields/Browse_button'), 
    filePath)

WebUI.delay(2)

CustomKeywords.'customKeywords.Enterkey.enter'()

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_Edit request/Flexiform_fields/Close attachment button'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_Create Request/btn_SaveasDraft'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.closeBrowser()

