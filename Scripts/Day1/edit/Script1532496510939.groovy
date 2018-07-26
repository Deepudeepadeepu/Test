import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates')

WebUI.setText(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_Submit'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/b_Recruitment'))

WebUI.setText(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_candidateSearchcandidate'), 'Radha')

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/li_Radha Krish Roy'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_btnSrch'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/a_Radha Krish Roy'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_btnSave'))

WebUI.setText(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_addCandidatekeyWords'), 'abcdefghi')

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_btnSave'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_btnBack'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/div_Job Title  AllAccount Cler'))

WebUI.setText(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_candidateSearchcandidate'), 'Ra')

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/li_Radha Krish Roy'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/a_Radha Krish Roy'))

WebUI.click(findTestObject('Object Repository/Edit/Page_OrangeHRM/input_btnBack'))

