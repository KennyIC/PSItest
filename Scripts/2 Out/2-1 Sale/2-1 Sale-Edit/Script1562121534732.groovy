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

WebUI.delay(1)

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Sort by number'))

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Sort by number'))

String XXX = GlobalVariable.Time

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Select by note', [('xxx') : XXX]))

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Edit button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/New item button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Select item'))

WebUI.setText(findTestObject('2 Out/2-1 Sale/Edit/Item number'), '5')

WebUI.setText(findTestObject('2 Out/2-1 Sale/Edit/Item price'), '1')

WebUI.setText(findTestObject('2 Out/2-1 Sale/Edit/Item total price'), '5')

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Item warehouse button'))

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Select warehouse'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('2 Out/2-1 Sale/Edit/Save button'))

