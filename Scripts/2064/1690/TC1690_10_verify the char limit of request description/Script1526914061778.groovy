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

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'Mandatory Assigned to')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Testdewdrops')

WebUI.verifyElementPresent(findTestObject('Page_Create Request/txt_500 char left'), 0)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam laoreet massa in eros varius, in consectetur ipsum accumsan. Morbi sed turpis semper, tincidunt urna ac, ultrices nisl. Quisque facilisis, risus sed viverra pulvinar, leo est congue risus, id molestie ipsum dolor vitae mi. Morbi tempus ultricies venenatis. Donec in lectus eget mauris tempus gravida vitae id quam. Integer eleifend pellentesque condimentum. Suspendisse ut ipsum iaculis, consectetur lacus eget, cursus lacus. Cras sed.')

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_Create Request/txt_Zero char left'), 0)

WebUI.click(findTestObject('Page_Edit request/Btn_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.delay(5)

WebUI.closeBrowser()

