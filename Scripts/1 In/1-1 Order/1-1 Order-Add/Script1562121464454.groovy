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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.click(findTestObject('1 In/1-1 Order/Add/New button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Order button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Vendor button'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Vendor'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/OrderDate'))

WebUI.click(findTestObject('1 In/1-1 Order/Add/Payment date 1 next month 10', [('xxx') : abc(0)]))

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

WebUI.setText(findTestObject('1 In/1-1 Order/Add/Qty'), GlobalVariable.Qty1)

WebUI.setText(findTestObject('1 In/1-1 Order/Add/Price'), GlobalVariable.Price1)

WebUI.setText(findTestObject('1 In/1-1 Order/Add/TPrice'), GlobalVariable.TPrice1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1 In/1-1 Order/Add/Save'))

def time() {
    def date = new Date()

    sdf = new SimpleDateFormat('yyyyMMddHHmm')

    GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

    return GlobalVariable.Time
}

def abc(def num) {
    Date today = new Date()

    Date day1 = new Date().plus(num)

    if (day1.format('MM') > today.format('MM')) {
        WebUI.click(findTestObject('1 In/1-2 Purchase/Add/Payment date next month'))

        return day1.format('d')
    } else {
        return day1.format('d')
    }
}

