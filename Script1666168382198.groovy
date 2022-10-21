import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.takeFullPageScreenshot()

WebUI.navigateToUrl('http://sde-stb-rzn-web.sit3.cardx.aliyun.sdecloud.tech/loyalty/login')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Log in_username'), 'issac')

WebUI.takeFullPageScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Log in_password'), 
    'IEFHPvKJFjOVNYQQpgt+FA==')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/button_Log in'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/i_Future Currency Pair Rate_mdi mdi-table-edit'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/i_Transaction Parameter_mdi mdi-view-dashboard'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/div_Add NewDeleted ItemShow 102550100 entri_6f2832'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Search_form-control form-control-sm'), 
    'EARNING')

WebUI.takeFullPageScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Search_form-control form-control-sm'), 
    '')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/div_Add NewDeleted ItemShow 102550100 entri_6f2832_1'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Search_form-control form-control-sm'), 
    'REDEMPTION')

WebUI.takeFullPageScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/input_Search_form-control form-control-sm'), 
    '')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_RewardzNow V1.10.86 - 2022-10-17/div_Add NewDeleted ItemShow 102550100 entri_6f2832_1'))

WebUI.takeFullPageScreenshot()

