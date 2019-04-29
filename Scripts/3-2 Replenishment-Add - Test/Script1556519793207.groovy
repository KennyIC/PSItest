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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.click(findTestObject('Others/test/Replenishment button'))

WebUI.delay(3)

//variable = WebUI.getText(findTestObject('Others/test/div_1-8  8'))
//WebUI.getText(findTestObject('Others/test/div_1-8  8')).substring(3, 4)
String extractInt = WebUI.getText(findTestObject('Others/test/div_1-8  8')) 

//String variable = extractInt.substring(2, 4)
count_number = extractInt.length()

if (count_number = 11) {
	String variable = extractInt.substring(8, 10)
	KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt)
}
else{
	String variable = extractInt.substring(7, 8)
	KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt)
}
//KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt.length())

//WebUI.click(findTestObject(null))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Replenishment execute button'))

not_run: WebUI.click(findTestObject('3-2 Replenishment/Employee button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Employee select'))

not_run: WebUI.click(findTestObject('3-2 Replenishment/Ship type button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Ship type select'))

not_run: WebUI.click(findTestObject('3-2 Replenishment/Vendor 1 button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Vendor 1 select'))

not_run: WebUI.setText(findTestObject('Object Repository/3-2 Replenishment/Vendor 1 order qty'), '10')

not_run: WebUI.click(findTestObject('3-2 Replenishment/Vendor 2 button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Vendor 2 select'))

not_run: WebUI.setText(findTestObject('Object Repository/3-2 Replenishment/Vendor 2 order qty'), '10')

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Save'))

