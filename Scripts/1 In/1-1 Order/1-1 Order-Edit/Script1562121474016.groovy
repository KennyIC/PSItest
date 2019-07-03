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

WebUI.delay(1)

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Sort by order no'))

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Sort by order no'))

String XXX = GlobalVariable.Time

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Select order by note', [('xxx') : XXX]))

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Order edit button'))

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Add item button'))

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Select item button'))

WebUI.click(findTestObject('1 In/1-1 Order/Edit/number button'))

WebUI.setText(findTestObject('1 In/1-1 Order/Edit/number text'), '5')

WebUI.click(findTestObject('1 In/1-1 Order/Edit/total price button'))

WebUI.setText(findTestObject('1 In/1-1 Order/Edit/total price text'), '5')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1 In/1-1 Order/Edit/save button'))

