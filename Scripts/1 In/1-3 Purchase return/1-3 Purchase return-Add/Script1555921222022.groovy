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

WebUI.click(findTestObject('1 In/1-3 Return/Add/Return button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Add button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Customer button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Customer'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-3 Return/Add/Payment'), '0: 1', true)

WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment Date 1'))

//WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date next month'))
WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date 1 next month 10', [('xxx') : abc(5)]))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment Date 2'))

//WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date 2 next month'))
WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date 2 next month 15', [('xxx') : abc(10)]))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment Date 3'))

//WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date 3 next month'))
WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date 3 next month 20', [('xxx') : abc(15)]))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Invoice select'))

WebUI.selectOptionByValue(findTestObject('1 In/1-3 Return/Add/Invoice'), '3: 4', true)

WebUI.setText(findTestObject('1 In/1-3 Return/Add/Invoice number'), GlobalVariable.Invoice_number)

WebUI.click(findTestObject('1 In/1-3 Return/Add/Empolyee button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Employee Larry'))

WebUI.setText(findTestObject('1 In/1-3 Return/Add/Purchase number'), 'BB87654321')

WebUI.setText(findTestObject('1 In/1-3 Return/Add/Note'), time())

WebUI.click(findTestObject('1 In/1-3 Return/Add/New item button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Item IPAD'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Unit button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Unit Change'))

WebUI.setText(findTestObject('1 In/1-3 Return/Add/Number'), '10')

WebUI.setText(findTestObject('1 In/1-3 Return/Add/Price'), '200')

WebUI.setText(findTestObject('1 In/1-3 Return/Add/Total price'), '2000')

WebUI.click(findTestObject('1 In/1-3 Return/Add/Warehouse button'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Warehouse 111'))

WebUI.click(findTestObject('1 In/1-3 Return/Add/Save'))

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
        WebUI.click(findTestObject('1 In/1-3 Return/Add/Payment date next month'))

        return day1.format('d')
    } else {
        return day1.format('d')
    }
}

