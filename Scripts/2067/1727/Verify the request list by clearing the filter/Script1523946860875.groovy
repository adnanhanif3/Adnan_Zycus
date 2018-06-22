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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Approval Listing/Pending_approvals'))

WebUI.click(findTestObject('Page_Approval Listing/btn_AddFilter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Approval Listing/btn_InApproval_Filter'))

WebUI.click(findTestObject('Page_Service request/Service request button'))

WebUI.delay(2)

CustomKeywords.'customKeywords.database.connectDB'()

Count = CustomKeywords.'customKeywords.database.executeQuery'('select count(*) as col_0_0_ from request_approval_user requestapp0_ left outer join request_approval requestapp1_ on requestapp0_.request_approval_id=requestapp1_.request_approval_id left outer join request request2_ on requestapp1_.request_id=request2_.request_id left outer join Request_definition requestdef3_ on request2_.request_Definition_id=requestdef3_.request_Definition_Id left outer join request_type requesttyp4_ on requestdef3_.request_type_id=requesttyp4_.request_type_id left outer join MASTER_USER user5_ on request2_.created_by_id=user5_.user_Idwhere requestapp1_.tenant_id=\'d801a7b0-b816-4c71-a52c-71f694cb3da8\' and requestapp1_.action_taken IN (-1,1,2) and request2_.deleted=0 and lower(requestapp0_.user_id)=\'15c874b1-cbb2-467b-a1aa-8ec4dcc3f6a8\' and request2_.deleted=0 and lower(requestapp0_.user_id)=\'15c874b1-cbb2-467b-a1aa-8ec4dcc3f6a8\'')

Expected = (Count + ' Requests')
WebUI.verifyElementPresent(findTestObject('Page_Approval Listing/Count_without_filter'), Count, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'customKeywords.database.closeDatabaseConnection'()

WebUI.closeBrowser()

