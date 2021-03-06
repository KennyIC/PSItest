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

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Batch maintain button'))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Batch maintain add button'))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item button'))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item select'))

WebUI.setText(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item life day'), '30')

WebUI.setText(findTestObject('3 Stock/3-5 Batch number maintain/Add/item batch code'), time())

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/item life date'))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item life date next month 23', [('xxx') : abc(0)]))

//WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item life date next month'))

//WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item life date next month 23'))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item enable'))

WebUI.selectOptionByValue(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item enable select'), '0: Y', true)

WebUI.setText(findTestObject('3 Stock/3-5 Batch number maintain/Add/Item note'), time())

WebUI.takeScreenshot()

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Add/Save button'))

def time() {
	def date = new Date()

	sdf = new SimpleDateFormat('yyyyMMddHHmm')

	GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

	return GlobalVariable.Time
}

def abc(def num) {
	Date today = new Date()

	Date day1 = new Date().plus(num)

	if (day1.format('MM') > today.format('MM')) {
		WebUI.click(findTestObject('1 In/1-2 Purchase/Add/Payment date next month'))

		return day1.format('d')
	} else {
		return day1.format('d')
	}
}
