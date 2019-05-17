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

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Stock take button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Add button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Stock take date'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Date 18', [('date') : today_check()]))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Employee button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Employee Larry'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Warehouse button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Warehouse 111'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Class button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Class IPAD'))

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Class ok button'))

WebUI.setText(findTestObject('3 Stock/3-1 Stock take/Note'), time())

//WebUI.clearText(findTestObject('3 Stock/3-1 Stock take/Stock number'))
WebUI.doubleClick(findTestObject('3 Stock/3-1 Stock take/Stock number'))

WebUI.sendKeys(findTestObject('3 Stock/3-1 Stock take/Stock number'), Keys.chord(Keys.DELETE))

WebUI.delay(10)

WebUI.sendKeys(findTestObject('3 Stock/3-1 Stock take/Stock number'), '600')

WebUI.selectOptionByValue(findTestObject('3 Stock/3-1 Stock take/Stock take done'), 'Y', true)

WebUI.setText(findTestObject('3 Stock/3-1 Stock take/Stock take IPAD note'), '-10')

WebUI.selectOptionByValue(findTestObject('3 Stock/3-1 Stock take/Done select'), 'Y', true)

WebUI.click(findTestObject('3 Stock/3-1 Stock take/Done'))

def time() {
    def date = new Date()

    sdf = new SimpleDateFormat('yyyyMMddHHmm')

    return GlobalVariable.Note + sdf.format(date)
}

def today_check() {
    Date today = new Date()

    return today.format('d')
}

