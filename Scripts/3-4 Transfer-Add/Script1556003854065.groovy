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

def time(){
	def date = new Date()
	sdf = new SimpleDateFormat("yyyyMMddHHmm")
	return GlobalVariable.Note + sdf.format(date)
}

WebUI.click(findTestObject('Object Repository/3-4 Transfer/Transfer button'))

WebUI.click(findTestObject('Object Repository/3-4 Transfer/Transfer note add'))

WebUI.click(findTestObject('3-4 Transfer/Transfer employee button'))

WebUI.click(findTestObject('Object Repository/3-4 Transfer/Transfer employee'))

WebUI.setText(findTestObject('Object Repository/3-4 Transfer/Transfer note'), time())

WebUI.click(findTestObject('Object Repository/3-4 Transfer/Transfer item add'))

WebUI.click(findTestObject('3-4 Transfer/Transfer item add select'))

WebUI.click(findTestObject('3-4 Transfer/Item unit select button'))

WebUI.click(findTestObject('3-4 Transfer/Item unit select'))

WebUI.click(findTestObject('3-4 Transfer/Item warehouse 1 button'))

WebUI.click(findTestObject('Object Repository/3-4 Transfer/Item warehouse 1 select'))

WebUI.click(findTestObject('3-4 Transfer/Item warehouse 2 button'))

WebUI.click(findTestObject('Object Repository/3-4 Transfer/Item warehouse 2 select'))

WebUI.setText(findTestObject('Object Repository/3-4 Transfer/Item QTY'), '1')

WebUI.setText(findTestObject('Object Repository/3-4 Transfer/Item Batch number'), '88888888')

WebUI.click(findTestObject('3-4 Transfer/Save button'))

