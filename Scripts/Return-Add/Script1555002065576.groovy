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

WebUI.click(findTestObject('Return/Return button'))

WebUI.click(findTestObject('Return/Add button'))

WebUI.click(findTestObject('Return/Vendor button'))

WebUI.click(findTestObject('Return/Vendor 2324'))

WebUI.click(findTestObject('Return/Payment select'))

WebUI.selectOptionByValue(findTestObject('Return/Payment'), '0: 1', true)

WebUI.click(findTestObject('Return/Payment date 1'))

WebUI.click(findTestObject('Return/Payment date 1 next month'))

WebUI.click(findTestObject('Return/Payment date 1 next month 10'))

WebUI.click(findTestObject('Return/Payment date 2'))

WebUI.click(findTestObject('Return/Payment date 2 next month'))

WebUI.click(findTestObject('Return/Payment date 2 next month 15'))

WebUI.click(findTestObject('Return/Payment date 3'))

WebUI.click(findTestObject('Return/Payment date 3 next month'))

WebUI.click(findTestObject('Return/Payment date 3 next month 20'))

WebUI.click(findTestObject('Return/Invoice select'))

WebUI.selectOptionByValue(findTestObject('Return/Invoice'), '3: 4', true)

WebUI.setText(findTestObject('Return/Invoice number'), 'AA123456')

WebUI.click(findTestObject('Return/Empolyee button'))

WebUI.click(findTestObject('Return/Employee Larry'))

WebUI.setText(findTestObject('Return/Purchase number'), 'BB87654321')

WebUI.setText(findTestObject('Return/Comment'), 'Test')

WebUI.click(findTestObject('Return/New item button'))

WebUI.click(findTestObject('Return/Item IPAD'))

WebUI.click(findTestObject('Return/Unit button'))

WebUI.click(findTestObject('Return/Unit Change'))

WebUI.setText(findTestObject('Return/Number'), '10')

WebUI.setText(findTestObject('Return/Price'), '200')

WebUI.setText(findTestObject('Return/Total price'), '2000')

WebUI.click(findTestObject('Return/Warehouse button'))

WebUI.click(findTestObject('Return/Warehouse 111'))

WebUI.click(findTestObject('Return/Save'))

