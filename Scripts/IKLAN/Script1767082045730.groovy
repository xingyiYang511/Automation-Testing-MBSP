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

WebUI.navigateToUrl('https://mbsphr-dev.veecotech.com.my/internal-login-hr')

WebUI.setText(findTestObject('Object Repository/IKLAN/Page_MBSP - Log Masuk/input__no_ktgn'), '99999')

WebUI.setEncryptedText(findTestObject('Object Repository/IKLAN/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Log Masuk/button_Log Masuk'))

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Dashboard/a_Log Keluar_mobile-collapse'))

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Dashboard/span_Kenaikan Pangkat'))

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Dashboard/span_Iklan'))

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Dashboard/span_Pra Iklan'))

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Pra Iklan Jawatan/a_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/IKLAN/Page_MBSP - Iklan Jawatan/input__nama'), 'test1230')

WebUI.selectOptionByValue(findTestObject('Object Repository/IKLAN/Page_MBSP - Iklan Jawatan/select_--PILIHAN--                         _e0541b'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/IKLAN/Page_MBSP - Iklan Jawatan/input__bilangan'), '1')

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Iklan Jawatan/button_Seterusnya'))

WebUI.click(findTestObject('Object Repository/IKLAN/Page_MBSP - Iklan Jawatan/button_Simpan dan Seterusnya'))

