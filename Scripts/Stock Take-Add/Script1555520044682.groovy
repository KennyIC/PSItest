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

WebUI.click(findTestObject('Object Repository/Stock take/Stock take button'))

WebUI.click(findTestObject('Object Repository/Stock take/Add button'))

WebUI.click(findTestObject('Stock take/Stock take date'))

WebUI.click(findTestObject('Stock take/Date 18'))

WebUI.click(findTestObject('Stock take/Employee button'))

WebUI.click(findTestObject('Object Repository/Stock take/Employee Larry'))

WebUI.click(findTestObject('Stock take/Warehouse button'))

WebUI.click(findTestObject('Object Repository/Stock take/Warehouse 111'))

WebUI.click(findTestObject('Stock take/Class button'))

WebUI.click(findTestObject('Object Repository/Stock take/Class IPAD'))

WebUI.click(findTestObject('Object Repository/Stock take/Class ok button'))

WebUI.setText(findTestObject('Object Repository/Stock take/Note'), 'Testing')

WebUI.setText(findTestObject('Stock take/Stock number'), '600')

WebUI.selectOptionByValue(findTestObject('Object Repository/Stock take/Stock take done'), 'Y', true)

WebUI.setText(findTestObject('Object Repository/Stock take/Stock take IPAD note'), '-10')

WebUI.selectOptionByValue(findTestObject('Stock take/Done select'), 'Y', true)

WebUI.click(findTestObject('Object Repository/Stock take/Done'))

