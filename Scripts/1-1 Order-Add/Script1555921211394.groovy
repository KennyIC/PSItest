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
import org.openqa.selenium.Keys as Keys

class testvalue{
	int qty = 10;
	int price = 200;
	int total_price = qty*price;
	}

WebUI.click(findTestObject('1-1 Order/New button'))

WebUI.click(findTestObject('1-1 Order/Order button'))

WebUI.click(findTestObject('1-1 Order/Vendor button'))

WebUI.click(findTestObject('1-1 Order/Vendor 2324'))

WebUI.click(findTestObject('1-1 Order/Employee button'))

WebUI.click(findTestObject('1-1 Order/Emplyee Larry'))

WebUI.click(findTestObject('1-1 Order/Ship button'))

WebUI.click(findTestObject('1-1 Order/Ship 1'))

WebUI.click(findTestObject('1-1 Order/TAX select'))

WebUI.selectOptionByValue(findTestObject('1-1 Order/TAX1'), '0: 1', true)

WebUI.setText(findTestObject('1-1 Order/Note'), GlobalVariable.Note)

WebUI.click(findTestObject('1-1 Order/Add item'))

WebUI.click(findTestObject('1-1 Order/Item IPAD'))

WebUI.click(findTestObject('1-1 Order/Unit button'))

WebUI.click(findTestObject('1-1 Order/Unit Change'))

WebUI.setText(findTestObject('1-1 Order/Qty'), qty)

WebUI.setText(findTestObject('1-1 Order/Price'), price)

WebUI.setText(findTestObject('1-1 Order/Total Price'), total_price)

WebUI.click(findTestObject('1-1 Order/Save'))

WebUI.delay(1)

not_run: WebUI.acceptAlert()

not_run: WebUI.verifyElementClickable(findTestObject('1-1 Order/Order button'))

