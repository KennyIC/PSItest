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

WebUI.click(findTestObject('Purchase/Purchase button'))

WebUI.delay(1)

WebUI.click(findTestObject('Purchase/Add button'))

WebUI.delay(1)

WebUI.click(findTestObject('Purchase/Vendor button'))

WebUI.click(findTestObject('Purchase/Vendor 2324'))

WebUI.click(findTestObject('Purchase/Payment select'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Purchase/Payment Cash'), '0: 1', true)

WebUI.delay(1)

WebUI.click(findTestObject('Purchase/Payment date 1'))

WebUI.click(findTestObject('Purchase/Payment date 1 next month'))

WebUI.click(findTestObject('Purchase/Payment date 1 next month_10'))

WebUI.click(findTestObject('Purchase/Payment date 2'))

WebUI.click(findTestObject('Purchase/Payment date 2 next month'))

WebUI.click(findTestObject('Purchase/Payment date 2 next month_15'))

WebUI.click(findTestObject('Purchase/Payment date 3'))

WebUI.click(findTestObject('Purchase/Payment date 3 next month'))

WebUI.click(findTestObject('Purchase/Payment date 3 next month_20'))

WebUI.click(findTestObject('Purchase/Invoice select'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Purchase/Invoice 1'), '3: 4', true)

not_run: WebUI.delay(1)

not_run: WebUI.delay(1)

WebUI.click(findTestObject('Purchase/Employee button'))

WebUI.click(findTestObject('Purchase/Emplyee Larry'))

WebUI.delay(1)

WebUI.setText(findTestObject('Purchase/Note'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_PSI/Invoice number'), 'AA888888')

WebUI.click(findTestObject('Purchase/Add item button'))

WebUI.click(findTestObject('Purchase/Item IPAD'))

WebUI.click(findTestObject('Purchase/Unit button'))

WebUI.click(findTestObject('Purchase/Unit Change'))

WebUI.setText(findTestObject('Purchase/Qty'), '10')

WebUI.setText(findTestObject('Purchase/Price'), '200')

WebUI.setText(findTestObject('Purchase/Total price'), '2000')

WebUI.click(findTestObject('Purchase/Warehouse button'))

WebUI.click(findTestObject('Purchase/Warehouse 111'))

WebUI.click(findTestObject('Purchase/Save'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.verifyElementClickable(findTestObject('Purchase/Purchase button'))

