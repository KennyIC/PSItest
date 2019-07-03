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

WebUI.click(findTestObject('1 In/1-2 Purchase/Delete/Sort by purchase no'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Delete/Sort by purchase no'))

String XXX = GlobalVariable.Time

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Delete/Select purchase by note', [('xxx') : XXX]))

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Delete/Purchase delete button'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1 In/1-2 Purchase/Delete/Ok button'))

WebUI.delay(2)

WebUI.click(findTestObject('1 In/1-2 Purchase/Delete/Sort by purchase no'))

WebUI.click(findTestObject('1 In/1-2 Purchase/Delete/Sort by purchase no'))

WebUI.takeScreenshot()

String ZZZ = WebUI.getText(findTestObject('Object Repository/1 In/1-2 Purchase/Delete/Select purchase by note'))

//KeywordUtil.logInfo('XXXXXXXXXXXX11-===' + ZZZ)
WebUI.verifyNotMatch(XXX, ZZZ, true)

