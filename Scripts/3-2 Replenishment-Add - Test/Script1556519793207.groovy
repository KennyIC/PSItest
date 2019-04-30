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

WebUI.delay(3)

WebUI.click(findTestObject('Others/test/Replenishment button'))

WebUI.delay(3)
//WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Replenishment execute button'))

//variable = WebUI.getText(findTestObject('Others/test/div_1-8  8'))
//WebUI.getText(findTestObject('Others/test/div_1-8  8')).substring(3, 4)

String extractInt = WebUI.getText(findTestObject('Others/test/div_1-8  8'))

//String variable = extractInt.substring(2, 4)
int variable
int count_number = extractInt.length()
variable = extractInt.substring()
KeywordUtil.logInfo('XXXXXXXXXXXX' + variable)


switch(count_number) {
	case 1:
		count_number == 11
		variable = extractInt.substring(7, 10)
		KeywordUtil.logInfo('XXXXXXXXXXXX' + variable)
		break;
	case 2:
		count_number == 9
		variable = extractInt.substring(6, 8)
		KeywordUtil.logInfo('XXXXXXXXXXXX' + variable)
		break;
 }


/*if (count_number == 11) {
    variable = extractInt.substring(7, 9)
    KeywordUtil.logInfo('XXXXXXXXXXXX' + variable)
} else {
    variable = extractInt.substring(6, 7)
    KeywordUtil.logInfo('XXXXXXXXXXXX' + variable)
}*/

//KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt.length())
//WebUI.click(findTestObject(null))
//WebUI.delay(1)

for(int count_cycle = 0; count_cycle < variable; count_cycle++) {
	WebUI.click(findTestObject('3-2 Replenishment/Vendor 1 button'))
	WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Vendor 1 select'))
	WebUI.setText(findTestObject('Object Repository/3-2 Replenishment/Vendor 1 order qty'), '10')
}


not_run: WebUI.click(findTestObject('3-2 Replenishment/Employee button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Employee select'))

not_run: WebUI.click(findTestObject('3-2 Replenishment/Ship type button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Ship type select'))

not_run: WebUI.click(findTestObject('3-2 Replenishment/Vendor 2 button'))

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Vendor 2 select'))

not_run: WebUI.setText(findTestObject('Object Repository/3-2 Replenishment/Vendor 2 order qty'), '10')

not_run: WebUI.click(findTestObject('Object Repository/3-2 Replenishment/Save'))

