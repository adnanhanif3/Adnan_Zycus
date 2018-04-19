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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'customKeywords.database.connectDB'()

Count = CustomKeywords.'customKeywords.database.executeQuery'('select count(*) from request where tenant_id=\'d801a7b0-b816-4c71-a52c-71f694cb3da8\' and created_by_id=\'15c874b1-cbb2-467b-a1aa-8ec4dcc3f6a8\' and status not in (6,3,9,10,11,12,13) and deleted=0')

Expected = (Count + ' Requests')

WebUI.verifyElementText(findTestObject('Page_Home/Overview/Pending Request Count Number'), Expected)

CustomKeywords.'customKeywords.database.closeDatabaseConnection'()

WebUI.click(findTestObject('Page_Home/Procurement Services/btn_CreateNow1'))

WebUI.sendKeys(findTestObject('Page_Create Request/txt_RequestName'), 'New request by Katalon')

WebUI.click(findTestObject('Page_Create Request/btn_UrgentYes'))

WebUI.sendKeys(findTestObject('Page_Create Request/txtarea_Desc'), 'Loreum Ipsum')

WebUI.click(findTestObject('Page_Create Request/btn_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Create Request/icon_Close'))

WebUI.click(findTestObject('Page_Home/Menu Nav/HOME'))

CustomKeywords.'customKeywords.database.connectDB'()

Count = CustomKeywords.'customKeywords.database.executeQuery'('select count(*) from request where tenant_id=\'d801a7b0-b816-4c71-a52c-71f694cb3da8\' and created_by_id=\'15c874b1-cbb2-467b-a1aa-8ec4dcc3f6a8\' and status not in (6,3,9,10,11,12,13) and deleted=0')

Expected = (Count + ' Requests')

WebUI.verifyElementText(findTestObject('Page_Home/Overview/Pending Request Count Number'), Expected)

CustomKeywords.'customKeywords.database.closeDatabaseConnection'()

WebUI.closeBrowser()

