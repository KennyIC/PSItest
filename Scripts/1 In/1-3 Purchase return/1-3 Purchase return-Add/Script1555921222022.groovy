import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.text.SimpleDateFormat as SimpleDateFormat

def time(){
	def date = new Date()
	sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm")
	return GlobalVariable.Note + sdf.format(date)
}


def abc(num){
Date today = new Date()
Date day1 = new Date().plus(num)
if(day1.format('MM') > today.format('MM')){
	WebUI.click(findTestObject('1 In/1-3 Return/Payment date next month'))
	return day1.format('d')}
else{
	return day1.format('d')}
}

WebUI.click(findTestObject('1 In/1-3 Return/Return button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add button'))

WebUI.click(findTestObject('1 In/1-3 Return/Customer button'))

WebUI.click(findTestObject('1 In/1-3 Return/Customer 95230'))

WebUI.click(findTestObject('1 In/1-3 Return/Payment select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-3 Return/Payment'), '0: 1', true)

WebUI.click(findTestObject('1 In/1-3 Return/Payment Date 1'))

//WebUI.click(findTestObject('1 In/1-3 Return/Payment date next month'))
WebUI.click(findTestObject('1 In/1-3 Return/Payment date 1 next month 10', [('xxx') : abc(5)]))

WebUI.click(findTestObject('1 In/1-3 Return/Payment Date 2'))

//WebUI.click(findTestObject('1 In/1-3 Return/Payment date 2 next month'))
WebUI.click(findTestObject('1 In/1-3 Return/Payment date 2 next month 15', [('xxx') : abc(10)]))

WebUI.click(findTestObject('1 In/1-3 Return/Payment Date 3'))

//WebUI.click(findTestObject('1 In/1-3 Return/Payment date 3 next month'))
WebUI.click(findTestObject('1 In/1-3 Return/Payment date 3 next month 20', [('xxx') : abc(15)]))

WebUI.click(findTestObject('1 In/1-3 Return/Invoice select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-3 Return/Invoice'), '3: 4', true)

WebUI.setText(findTestObject('1 In/1-3 Return/Invoice number'), GlobalVariable.Invoice_number)

WebUI.click(findTestObject('1 In/1-3 Return/Empolyee button'))

WebUI.click(findTestObject('1 In/1-3 Return/Employee Larry'))

WebUI.setText(findTestObject('1 In/1-3 Return/Purchase number'), 'BB87654321')

WebUI.setText(findTestObject('1 In/1-3 Return/Comment'), time())

WebUI.click(findTestObject('1 In/1-3 Return/New item button'))

WebUI.click(findTestObject('1 In/1-3 Return/Item IPAD'))

WebUI.click(findTestObject('1 In/1-3 Return/Unit button'))

WebUI.click(findTestObject('1 In/1-3 Return/Unit Change'))

WebUI.setText(findTestObject('1 In/1-3 Return/Number'), '10')

WebUI.setText(findTestObject('1 In/1-3 Return/Price'), '200')

WebUI.setText(findTestObject('1 In/1-3 Return/Total price'), '2000')

WebUI.click(findTestObject('1 In/1-3 Return/Warehouse button'))

WebUI.click(findTestObject('1 In/1-3 Return/Warehouse 111'))

WebUI.click(findTestObject('1 In/1-3 Return/Save'))