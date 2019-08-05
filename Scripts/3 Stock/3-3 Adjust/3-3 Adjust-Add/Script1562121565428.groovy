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


WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Adjuset button'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Add button'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Adjust type button'))

WebUI.selectOptionByValue(findTestObject('3 Stock/3-3 Adjust/Add/Adjust type select'), '0: 2', true)

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Adjust employee button'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Adjust employee'))

WebUI.setText(findTestObject('3 Stock/3-3 Adjust/Add/input__comments'), time())

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Adjust item button'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/item select'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/Item unit button'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/item unit'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/item warehouse button'))

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/item warehouse'))

WebUI.setText(findTestObject('3 Stock/3-3 Adjust/Add/item qty'), GlobalVariable.Qty1)

WebUI.setText(findTestObject('3 Stock/3-3 Adjust/Add/item price'), '120')

WebUI.setText(findTestObject('3 Stock/3-3 Adjust/Add/item price 1'), '150')

WebUI.takeScreenshot()

WebUI.click(findTestObject('3 Stock/3-3 Adjust/Add/save'))

def time() {
	
	def date = new Date()

	sdf = new SimpleDateFormat('yyyyMMddHHmm')
	
	GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

	return GlobalVariable.Note + sdf.format(date)
}

def today_check() {
	
	Date today = new Date()

	return today.format('d')
}

