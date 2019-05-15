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

WebUI.click(findTestObject('1 In/1-1 Order/Add/New button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Order button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Vendor button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Vendor 2324'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Employee button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Emplyee Larry'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Ship button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Ship 1'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/TAX select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-1 Order/Add/TAX1'), '0: 1', true)

WebUI.setText(findTestObject('1 In/1-1 Order/Add/Note'), time())

WebUI.click(findTestObject('1 In/1-1 Order/Add/Add item'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Item IPAD'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Unit button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Unit Change'))

WebUI.setText(findTestObject('1 In/1-1 Order/Add/Qty'), '10')

WebUI.setText(findTestObject('1 In/1-1 Order/Add/Price'), '200')

WebUI.setText(findTestObject('1 In/1-1 Order/Add/Total Price'), '2000')

WebUI.click(findTestObject('1 In/1-1 Order/Add/Save'))

WebUI.delay(1)

not_run: WebUI.acceptAlert()

not_run: WebUI.verifyElementClickable(findTestObject('1 In/1-1 Order/Add/Order button'))



def time() {
    def date = new Date()

    sdf = new SimpleDateFormat('yyyyMMddHHmm')

    GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

    return GlobalVariable.Time
}

