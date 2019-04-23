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

WebUI.click(findTestObject('Object Repository/3-5 Btach number maintain/Batch maintain button'))

WebUI.click(findTestObject('Object Repository/3-5 Btach number maintain/Batch maintain add button'))

WebUI.click(findTestObject('3-5 Btach number maintain/Item button'))

WebUI.click(findTestObject('3-5 Btach number maintain/Item select'))

WebUI.setText(findTestObject('Object Repository/3-5 Btach number maintain/Item life day'), '30')

WebUI.setText(findTestObject('Object Repository/3-5 Btach number maintain/item batch code'), '77889900')

WebUI.click(findTestObject('3-5 Btach number maintain/item life date'))

WebUI.click(findTestObject('3-5 Btach number maintain/Item life date next month'))

WebUI.click(findTestObject('3-5 Btach number maintain/Item life date next month 23'))

WebUI.click(findTestObject('3-5 Btach number maintain/Item enable'))

WebUI.selectOptionByValue(findTestObject('Object Repository/3-5 Btach number maintain/Item enable select'), '0: Y', true)

WebUI.setText(findTestObject('Object Repository/3-5 Btach number maintain/Item note'), 'Testing')

WebUI.click(findTestObject('Object Repository/3-5 Btach number maintain/Save button'))

