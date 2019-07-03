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

String extractInt
int count_number
int variable
int count_cycle
int a
WebUI.click(findTestObject('Others/test/Replenishment button'))

WebUI.delay(1)

extractInt = WebUI.getText(findTestObject('Others/test/div_1-8  8'))

WebUI.delay(1)

//KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt)

WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Replenishment execute button'))

WebUI.delay(1)
count_number = extractInt.length()

if (count_number == 11) {
    
	extractInt = substring(10, 11)

//    KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt)

} else {
	
	KeywordUtil.logInfo('XXXXXXXXXXXX11-===' + extractInt)
    
	a = extractInt.substring(6, 7).toInteger()
		
//    KeywordUtil.logInfo('XXXXXXXXXXXX' + a)
}

WebUI.delay(1)

for (count_cycle = 1; count_cycle < a; count_cycle++) {
	
	KeywordUtil.logInfo('XXXXXXXXXXXX11-===' + count_cycle)
	int www = count_cycle * 8
    WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 1 button', [('sss') : www]))
	
	

    WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 1 select'))

    WebUI.setText(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 1 order qty'), '10')
}

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Employee button'))

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Employee select'))

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Ship type button'))

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Ship type select'))

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 2 button'))

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 2 select'))

not_run: WebUI.setText(findTestObject('3 Stock/3-2 Replenishment/Add/Vendor 2 order qty'), '10')

not_run: WebUI.click(findTestObject('3 Stock/3-2 Replenishment/Add/Save'))

//variable = WebUI.getText(findTestObject('Others/test/div_1-8  8'))
//WebUI.getText(findTestObject('Others/test/div_1-8  8')).substring(3, 4)
//String variable = extractInt.substring(2, 4)
//int variable = extractInt.substring()

/*switch(variable) {
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
 }*/

//KeywordUtil.logInfo('XXXXXXXXXXXX' + extractInt.length())
//WebUI.click(findTestObject(null))
//WebUI.delay(1)
