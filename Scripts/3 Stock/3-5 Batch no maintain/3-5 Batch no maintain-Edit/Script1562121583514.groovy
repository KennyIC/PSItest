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

WebUI.delay(1)

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Sort by number'))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Sort by number'))

String XXX = GlobalVariable.Time

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Select by number', 
        [('xxx') : XXX]))

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Edit button'))

WebUI.sendKeys(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Life days'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Life days'), 
    Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Life days'), 
    '60')

WebUI.takeScreenshot()

WebUI.click(findTestObject('3 Stock/3-5 Batch number maintain/Edit/Save button'))

