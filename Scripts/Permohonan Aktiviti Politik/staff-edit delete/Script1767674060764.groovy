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

WebUI.setText(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Log Masuk/input__no_ktgn'), '99999')

WebUI.setEncryptedText(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Dashboard/span_Permohonan TanahSaham_dash-mtext'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/span'))

WebUI.selectOptionByValue(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Permohonan Baru Aktiviti Politik/select__application_type'), 
    'hold_party_office', true)

WebUI.setText(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Permohonan Baru Aktiviti Politik/input__party_name'), 
    'XXX')

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Permohonan Baru Aktiviti Politik/input_Perakuan_acknowledge'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Permohonan Baru Aktiviti Politik/button_Batal_btn btn-primary px-4'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/a__mx-3 btn btn-sm d-flex align-items-cente_89f6a6'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/a__mx-3 btn btn-sm d-flex align-items-cente_89f6a6'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/button_Lihat Butiran Pemakluman Penglibatan_bf6d77'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/a__btn btn-sm btn-icon d-flex align-items-c_163dfb'))

WebUI.setText(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Kemaskini Permohonan Aktiviti Politik/input_Bahagian  Cawangan_party_branch'), 
    'TTT')

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Kemaskini Permohonan Aktiviti Politik/button_Kembali_btnSubmit'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Kemaskini Permohonan Aktiviti Politik/button_Batal_confirmSubmit'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/a__mx-3 btn btn-sm d-flex align-items-cente_89f6a6'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/button_Lihat Butiran Pemakluman Penglibatan_bf6d77'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/button__btn btn-sm btn-icon bs-pass-para d-_6d769a'))

WebUI.click(findTestObject('Object Repository/STAFF-EDIT DELETE/Page_MBSP - Pemakluman Penglibatan Politik/button_No_swal2-confirm btn btn-success'))

