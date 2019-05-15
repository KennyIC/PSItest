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
	WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date next month'))
	return day1.format('d')}
else{
	return day1.format('d')}
}

WebUI.click(findTestObject('1 In/1-2 Purchase/Purchase button'))

WebUI.callTestCase(findTestCase('Others/Get Today'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 In/1-2 Purchase/Add button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Vendor button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Vendor 2324'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-2 Purchase/Payment Cash'), '0: 1', true)

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date 1'))

//WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date next month'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date 1 next month_10', [('xxx') : abc(5)]))

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date 2'))

//WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date 2 next month_15', [('xxx') : abc(10)]))

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date 3'))

//WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Payment date 3 next month_20', [('xxx') : abc(15)]))

WebUI.click(findTestObject('1 In/1-2 Purchase/Invoice select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-2 Purchase/Invoice 1'), '3: 4', true)

WebUI.click(findTestObject('1 In/1-2 Purchase/Employee button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Emplyee Larry'))

WebUI.setText(findTestObject('1 In/1-2 Purchase/Note'), time())

WebUI.setText(findTestObject('1 In/1-2 Purchase/Invoice number'), GlobalVariable.Invoice_number)

WebUI.click(findTestObject('1 In/1-2 Purchase/Add item button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Item IPAD'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Unit button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Unit Change'))

WebUI.setText(findTestObject('1 In/1-2 Purchase/Qty'), '10')

WebUI.setText(findTestObject('1 In/1-2 Purchase/Price'), '200')

WebUI.setText(findTestObject('1 In/1-2 Purchase/Total price'), '2000')

WebUI.click(findTestObject('1 In/1-2 Purchase/Warehouse button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Warehouse 111'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Save'))

