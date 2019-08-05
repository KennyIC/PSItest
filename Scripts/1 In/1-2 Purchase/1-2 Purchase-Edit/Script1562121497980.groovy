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

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Sort button by no'))

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Sort button by no'))

String XXX = GlobalVariable.Time

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Select Purchase by note', [('xxx') : XXX]))

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Edit button'))

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Add item button'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Edit/Select item button'))

WebUI.setText(findTestObject('1 In/1-2 Purchase/Edit/Qty'), GlobalVariable.Qty2)

WebUI.setText(findTestObject('1 In/1-2 Purchase/Edit/Price'), GlobalVariable.Price2)

WebUI.setText(findTestObject('1 In/1-2 Purchase/Edit/Tprice'), GlobalVariable.TPrice2)

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Warehouse button'))

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Warehouse 111'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Edit/Save button'))

