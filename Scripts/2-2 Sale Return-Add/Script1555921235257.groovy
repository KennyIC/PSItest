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

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Add button'))

WebUI.click(findTestObject('2-2 Sale Return/Sale customer button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale customer 0000'))

WebUI.click(findTestObject('2-2 Sale Return/Sale return date button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return date'))

WebUI.click(findTestObject('2-2 Sale Return/Sale return payment button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2-2 Sale Return/Sale return payment select'), '1: 5', true)

WebUI.click(findTestObject('2-2 Sale Return/Sale return payment 1 button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return payment 1 next month'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return payment 1 next month 10'))

WebUI.click(findTestObject('2-2 Sale Return/Sale return payment 2 button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return payment 2 next month'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return payment 2 next month 15'))

WebUI.click(findTestObject('2-2 Sale Return/Sale return payment 3 button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return payment 3 next month'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return payment 3 next month 20'))

WebUI.click(findTestObject('2-2 Sale Return/Sale return invoice button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2-2 Sale Return/Sale return invoice select'), '1: 2', true)

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Sale return invoice number'), 'AB000000')

WebUI.click(findTestObject('2-2 Sale Return/Sale return employee button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return employee 0000'))

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Sale return bill number'), '88888888')

WebUI.click(findTestObject('2-2 Sale Return/Sale return tax button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2-2 Sale Return/Sale return tax select'), '1: 2', true)

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Sale return note'), 'testing')

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Item add button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Item good'))

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Item number'), '2')

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Item price'), '300')

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Item total price'), '600')

WebUI.click(findTestObject('2-2 Sale Return/Item warehouse button'))

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Item warehouse'))

WebUI.setText(findTestObject('Object Repository/2-2 Sale Return/Item tax'), '30')

WebUI.click(findTestObject('Object Repository/2-2 Sale Return/Sale return save'))

