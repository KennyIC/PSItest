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

def time() {
    def date = new Date()

    sdf = new SimpleDateFormat('yyyyMMddHHmm')

    GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

    return GlobalVariable.Time
	
	}


def month_check(num){
	
	Date today = new Date()
	
	Date day1 = new Date().plus(num)
	
	if(day1.format('MM') > today.format('MM')){
	
		WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment next month'))
		
		return day1.format('d')}
	
	else{
	
		return day1.format('d')}
	
	}

def today_check(){

	Date today = new Date()
	
	return today.format('d')

	}
	
WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale add button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale customer button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale customer 95230'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale date button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale date today', [('date') : today_check()]))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale sales button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale sales 0001'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale ship type button'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale ship type select'), '0: 2', true)

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment type button'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment type select'), '0: 4', true)

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 1'))

//WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment next month'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 1 next month 10', [('xxx') : month_check(5)]))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 2'))

//WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 2 next month'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 2 next month 15', [('xxx') : month_check(10)]))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 3'))

//WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 3 next month'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale payment 3 next month 20', [('xxx') : month_check(15)]))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale invoice number'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale invoice select'), '3: 4', true)

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale TAX button'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale TAX select'), '1: 2', true)

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale invoice number'), GlobalVariable.Invoice_number)

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale GUI number'), '12345678')

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale contact window button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale contact window 0001'))

WebUI.selectOptionByValue(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale city select'), '1: 2', true)

WebUI.selectOptionByValue(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale dist select'), '9: 17', true)

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale address'), '瑞光路584號')

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale note'), time())

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item add button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item ipad'))

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item number'), '2')

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item price'), '300')

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item total price'), '600')

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item discount'), '0.9')

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item warehouse button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item warehouse 0testwarehous0'))

WebUI.setText(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Item note'), 'item testing')

WebUI.click(findTestObject('2 Out/2-1 Sale/2-1 Sale-add/Sale save button'))

