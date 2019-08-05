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


WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Add button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale customer button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale customer 0000'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return date button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return date', [('date') : today_check()]))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment button'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment select'), '1: 5', true)

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 1 button'))

//WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment next month'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 1 next month 10', [('xxx') : abc(5)]))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 2 button'))

//WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 2 next month'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 2 next month 15', [('xxx') : abc(10)]))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 3 button'))

//WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 3 next month'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment 3 next month 20', [('xxx') : abc(15)]))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return invoice button'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-2 Sale Return/Add/Sale return invoice select'), '1: 2', true)

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Sale return invoice number'), GlobalVariable.Invoice_number)

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return employee button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return employee 0000'))

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Sale return bill number'), '88888888')

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return tax button'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-2 Sale Return/Add/Sale return tax select'), '1: 2', true)

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Sale return note'), time())

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Item add button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Item good'))

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Qty'), GlobalVariable.Qty1)

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Price'), GlobalVariable.Price1)

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Tprice'), GlobalVariable.TPrice1)

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Item warehouse button'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Item warehouse'))

WebUI.setText(findTestObject('2 Out/2-2 Sale Return/Add/Item tax'), '30')

WebUI.takeScreenshot()

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return save'))

def time() {
	def date = new Date()

	sdf = new SimpleDateFormat('yyyyMMddHHmm')

	GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

	return GlobalVariable.Time
	
	}


def abc(num){
Date today = new Date()
Date day1 = new Date().plus(num)
if(day1.format('MM') > today.format('MM')){
	WebUI.click(findTestObject('2 Out/2-2 Sale Return/Add/Sale return payment next month'))
	return day1.format('d')}
else{
	return day1.format('d')}
}

def today_check(){
	Date today = new Date()
	return today.format('d')
}

