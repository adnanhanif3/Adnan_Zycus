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

WebUI.comment('Verify Basic details section')

WebUI.callTestCase(findTestCase('Common TC/Ronaldo Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home/Procurement Services/btn_CreateNow'))

String a = WebUI.getText(findTestObject('Page_Create Request/txt_BasicDetails'))

String[] r = a.split('\n')

println(r)

String[] ip = new String[10]

	ip[0]="Request Name *"
	ip[1]="Request Type"
	ip[2]="Sourcing"
	ip[3]="Urgent Requirement"
	ip[4]="Yes"
	ip[5]="No"
	ip[6]="Request Description"
	ip[7]="100 Char left"
	ip[8]="Add Attachments"
	ip[9]="Browse"
	
for(int i=0;i<2;i++)
{
	if(ip[i].equals(r[i]))
	{
		println "Basic details matched : "+ip[i]+" "+" is Present";
	}
	else
	{
		println ip[i]+"error at "+i+" "+r[i]+" "+" Missing";
	}	
}

for(int i=3;i<10;i++)
{
	if(ip[i].equals(r[i]))
	{
		println "Basic details matched : "+ip[i]+" "+"is Present";
	}
	else
	{
		println ip[i]+"error at "+i+" "+r[i]+" "+" Missing";
	}
}