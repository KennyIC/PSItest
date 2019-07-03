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

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Replenishment button'))

WebUI.delay(1)

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Replenishment execute button'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Employee button'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Employee select'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Ship type button'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Ship type select'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 1 button'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 1 select'))

WebUI.setText(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 1 order qty'), '10')

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 2 button'))

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 2 select'))

WebUI.setText(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 2 order qty'), '10')

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Save'))

