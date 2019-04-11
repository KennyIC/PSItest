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

WebUI.click(findTestObject('Object Repository/Return/Return button'))

WebUI.click(findTestObject('Object Repository/Return/Add button'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Return/Vendor 2324'))

WebUI.acceptAlert()

WebUI.selectOptionByValue(findTestObject('Object Repository/Return/Payment select'), '0: 1', true)

WebUI.click(findTestObject('Object Repository/Return/button__btn btn-link ngb-dp-arrow-btn'))

WebUI.click(findTestObject('Object Repository/Return/div_5'))

WebUI.click(findTestObject('Object Repository/Return/svg__svg-inline--fa fa-calendar-alt fa-w-14'))

WebUI.click(findTestObject('Object Repository/Return/button__btn btn-link ngb-dp-arrow-btn'))

WebUI.click(findTestObject('Object Repository/Return/div_10'))

WebUI.click(findTestObject('Object Repository/Return/path'))

WebUI.click(findTestObject('Object Repository/Return/span__ngb-dp-navigation-chevron'))

WebUI.click(findTestObject('Object Repository/Return/div_15'))

WebUI.acceptAlert()

WebUI.selectOptionByValue(findTestObject('Object Repository/Return/Invoice'), '3: 4', true)

WebUI.setText(findTestObject('Object Repository/Return/Invoice number'), 'AA123456')

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Return/Employee Larry'))

WebUI.setText(findTestObject('Object Repository/Return/Purchase number'), 'BB87654321')

WebUI.setText(findTestObject('Object Repository/Return/Comment'), 'Test')

WebUI.click(findTestObject('Object Repository/Return/New item button'))

WebUI.click(findTestObject('Object Repository/Return/Item IPAD'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Return/Unit change'))

WebUI.setText(findTestObject('Object Repository/Return/Number'), '10')

WebUI.setText(findTestObject('Object Repository/Return/Price'), '200')

WebUI.setText(findTestObject('Object Repository/Return/Total price'), '2000')

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Return/Warehouse 111'))

WebUI.click(findTestObject('Object Repository/Return/Save'))

