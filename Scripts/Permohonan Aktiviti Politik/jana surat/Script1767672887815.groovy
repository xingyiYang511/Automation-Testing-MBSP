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

WebUI.setText(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Log Masuk/input__no_ktgn'), '99999')

WebUI.setEncryptedText(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Dashboard/span_Permohonan TanahSaham_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Pemakluman Penglibatan Politik/i__ti ti-eye text-white'))

WebUI.click(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Pemakluman Penglibatan Politik/a_Muat Turun Surat Kelulusan_btn btn-outlin_f75eb4'))

WebUI.click(findTestObject('Object Repository/PAP-jana surat/Page_MBSP - Pemakluman Penglibatan Politik/a_Permohonan anda telah diluluskan_btn btn-_85b4d2'))

