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

WebUI.callTestCase(findTestCase('Common TC/Login To irequest portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'Approver/requester')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Testdewdrops')

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Home/Menu Nav/TO DOs arrow'))

WebUI.click(findTestObject('Page_Approval Listing/Approval_dropdwn'))

WebUI.click(findTestObject('Page_Approval Listing/link_Rejectcard1'))

WebUI.click(findTestObject('Page_Approval Listing/txtarea_RejectComment'))

WebUI.sendKeys(findTestObject('Page_Approval Listing/txtarea_RejectComment'), 'Rejected')

WebUI.click(findTestObject('Page_Approval Listing/btn_Reject in Comment Window'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Page_Home/Menu Nav/MY REQUESTS arrow'))

WebUI.click(findTestObject('Page_Service request/My request xpath'))

WebUI.click(findTestObject('Page_Service request/Edit request button(Rejected, Returned)'))

WebUI.click(findTestObject('Page_Create Request/btn_UrgentYes'))

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.click(findTestObject('Page_Home/Menu Nav/TO DOs arrow'))

WebUI.click(findTestObject('Page_Approval Listing/Approval_dropdwn'))

WebUI.click(findTestObject('Page_Approval Listing/link_Rejectcard1'))

WebUI.click(findTestObject('Page_Approval Listing/txtarea_RejectComment'))

WebUI.sendKeys(findTestObject('Page_Approval Listing/txtarea_RejectComment'), 'Rejected')

WebUI.click(findTestObject('Page_Approval Listing/btn_Reject in Comment Window'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Page_Home/Menu Nav/MY REQUESTS arrow'))

WebUI.click(findTestObject('Page_Service request/My request xpath'))

WebUI.click(findTestObject('Page_Service request/Edit request button(Rejected, Returned)'))

WebUI.click(findTestObject('Page_Edit request/Audit_version'))

WebUI.selectOptionByValue(findTestObject('Page_Edit request/Audit_version'), '1', false)

WebUI.closeBrowser()

