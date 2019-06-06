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

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer button'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer note add'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer employee button'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer employee'))

WebUI.setText(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer note'), time())

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer item add'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Transfer item add select'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item unit select button'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item unit select'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item warehouse 1 button'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item warehouse 1 select'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item warehouse 2 button'))

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item warehouse 2 select'))

WebUI.setText(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item QTY'), '1')

not_run: WebUI.setText(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Item Batch number'), '88888888')

WebUI.click(findTestObject('3 Stock/3-4 Transfer/3-4 Transfer-add/Save button'))

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
