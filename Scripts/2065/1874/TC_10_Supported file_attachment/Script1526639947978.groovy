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

WebUI.sendKeys(findTestObject('Page_Home/Top Nav/Globalsearch_box'), 'Mandatory Assigned to')

WebUI.click(findTestObject('Page_Home/Top Nav/Dropdown_create new btn'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'Testdewdrops')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create Request/btn_SaveasDraft'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Approval Listing/Alert_close'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Service request/Edit request button(Draft)'))

String userDir = System.getProperty('user.dir')

String filePath = (userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\eCatalogue_User_Guides.pdf'

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\cartoon_birds_blue_flying_animation_clipart.gif')

/*WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\Cushioneer-1in stroke.IGS')*/
WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\d5f13f190530f169114b9d432b1688e7.png')

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\iRequest_Status_15March2018.ppt')

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\QA Questionnaire 2+.rar')

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\Test Document for attachment.docx')

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

filePath = ((userDir + '\\') + 'Data Files\\App Test Data\\FilesToUpload\\Test Results (eProc) - Sprint1.zip')

WebUI.uploadFile(findTestObject('Page_Create Request/Attachment'), filePath)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.closeBrowser()

