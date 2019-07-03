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

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Delete/Sort by sale return no'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Delete/Sort by sale return no'))

String XXX = GlobalVariable.Time

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Delete/Select sale return by note', [('xxx') : XXX]))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Delete/Sale Return delete button'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/2 Out/2-2 Sale Return/Delete/Ok button'))

WebUI.delay(2)

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Delete/Sort by sale return no'))

WebUI.click(findTestObject('2 Out/2-2 Sale Return/Delete/Sort by sale return no'))

WebUI.takeScreenshot()

String ZZZ = WebUI.getText(findTestObject('2 Out/2-2 Sale Return/Delete/Select sale return by note'))

//KeywordUtil.logInfo('XXXXXXXXXXXX11-===' + ZZZ)
WebUI.verifyNotMatch(XXX, ZZZ, true)

