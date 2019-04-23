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

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/Adjuset button'))

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/Add button'))

WebUI.click(findTestObject('3-3 Adjuset/Adjust type button'))

WebUI.selectOptionByValue(findTestObject('3-3 Adjuset/Adjust type select'), '0: 2', true)

WebUI.click(findTestObject('3-3 Adjuset/Adjust employee button'))

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/Adjust employee'))

WebUI.setText(findTestObject('Object Repository/3-3 Adjuset/input__comments'), 'Testing')

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/Adjust item button'))

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/item select'))

WebUI.click(findTestObject('3-3 Adjuset/Item unit button'))

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/item unit'))

WebUI.click(findTestObject('3-3 Adjuset/item warehouse button'))

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/item warehouse'))

WebUI.setText(findTestObject('Object Repository/3-3 Adjuset/item qty'), '10')

WebUI.setText(findTestObject('Object Repository/3-3 Adjuset/item price'), '120')

WebUI.setText(findTestObject('Object Repository/3-3 Adjuset/item price 1'), '150')

WebUI.click(findTestObject('Object Repository/3-3 Adjuset/save'))

