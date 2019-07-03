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
import org.openqa.selenium.Keys as Keys
import java.lang.Integer as Integer

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Stock take button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Add button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Stock take date'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Date 18', [('date') : today_check()]))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Employee button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Employee Larry'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Warehouse button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Warehouse 111'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Class button'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Class IPAD'))

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Class ok button'))

WebUI.setText(findTestObject('3 Stock/3-1 Stock Take/Add/Note'), time())

def qqq

qqq = WebUI.getAttribute(findTestObject('3 Stock/3-1 Stock Take/Add/Stock number'), 'value')

qqq = qqq.replaceAll(',', '')

int kkk = qqq.toInteger()

kkk = (kkk - 10)

WebUI.sendKeys(findTestObject('3 Stock/3-1 Stock Take/Add/Stock number'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('3 Stock/3-1 Stock Take/Add/Stock number'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('3 Stock/3-1 Stock Take/Add/Stock number'), kkk.toString())

WebUI.selectOptionByValue(findTestObject('3 Stock/3-1 Stock Take/Add/Stock take done'), 'Y', true)

WebUI.setText(findTestObject('3 Stock/3-1 Stock Take/Add/Stock take IPAD note'), '-10')

WebUI.selectOptionByValue(findTestObject('3 Stock/3-1 Stock Take/Add/Done select'), 'Y', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('3 Stock/3-1 Stock Take/Add/Done'))

def time() {
	
    def date = new Date()

    sdf = new SimpleDateFormat('yyyyMMddHHmm')
	
	GlobalVariable.Time = (GlobalVariable.Note + sdf.format(date))

    return GlobalVariable.Note + sdf.format(date)
}

def today_check() {
	
    Date today = new Date()

    return today.format('d')
}

