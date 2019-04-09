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

WebUI.click(findTestObject('Object Repository/Order/New button'))

WebUI.click(findTestObject('Object Repository/Order/Order button'))

WebUI.click(findTestObject('Order/Vendor button'))

WebUI.click(findTestObject('Object Repository/Order/Vendor 2324'))

WebUI.click(findTestObject('Order/Employee button'))

WebUI.click(findTestObject('Object Repository/Order/Emplyee Larry'))

WebUI.click(findTestObject('Order/Ship button'))

WebUI.click(findTestObject('Object Repository/Order/Ship 1'))

WebUI.click(findTestObject('Order/TAX select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order/TAX1'), '0: 1', true)

WebUI.setText(findTestObject('Object Repository/Order/Note'), 'Testing')

WebUI.click(findTestObject('Object Repository/Order/Add item'))

WebUI.click(findTestObject('Object Repository/Order/Item IPAD'))

WebUI.click(findTestObject('Order/Unit button'))

WebUI.click(findTestObject('Order/Unit Change'))

WebUI.setText(findTestObject('Object Repository/Order/Qty'), '10')

WebUI.setText(findTestObject('Object Repository/Order/Price'), '200')

WebUI.setText(findTestObject('Object Repository/Order/Total Price'), '2000')

WebUI.click(findTestObject('Object Repository/Order/Save'))

not_run: WebUI.switchToWindowIndex(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Order/Order button'))

