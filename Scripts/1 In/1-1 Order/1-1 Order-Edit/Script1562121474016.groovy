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

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Edit button'))

WebUI.verifyElementText(findTestObject('1 In/1-1 Order/Add/Vendor button'), '(0000)0測試廠商0')

WebUI.verifyElementText(findTestObject('1 In/1-1 Order/Add/Employee button'), '(0000)0測試員工0')

WebUI.verifyElementText(findTestObject('1 In/1-1 Order/Add/Ship button'), '測試運送方式1')

WebUI.verifyElementText(findTestObject('1 In/1-1 Order/Add/TAX select'), '應稅外加')

WebUI.verifyElementPresent(findTestObject('1 In/1-1 Order/Add/Qty'), 10)

WebUI.verifyElementPresent(findTestObject('1 In/1-1 Order/Add/Price'), 200)

WebUI.verifyElementPresent(findTestObject('1 In/1-1 Order/Add/TPrice'), 2000)

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Add item button'))

WebUI.click(findTestObject('1 In/1-1 Order/Edit/Select item button'))

WebUI.setText(findTestObject('1 In/1-1 Order/Edit/Qty'), GlobalVariable.Qty2)

WebUI.setText(findTestObject('1 In/1-1 Order/Edit/Price'), GlobalVariable.Price2)

WebUI.setText(findTestObject('1 In/1-1 Order/Edit/Tprice'), GlobalVariable.TPrice2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1 In/1-1 Order/Edit/save button'))

