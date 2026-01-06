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

WebUI.setText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__no_ktgn'), '11111')

WebUI.setEncryptedText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Permohonan TanahSaham_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/a_Eksport_btn btn-sm btn-secondary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Permohonan Baru Aktiviti Politik/select__application_type'), 
    'pre_retirement_activity', true)

WebUI.setText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Permohonan Baru Aktiviti Politik/input__party_name'), 
    'DAP')

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Permohonan Baru Aktiviti Politik/input_Perakuan_acknowledge'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Permohonan Baru Aktiviti Politik/button_Batal_btn btn-primary px-4'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/span_Log Keluar_hide-mob ms-2'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/a_Konfigurasi Pelatih Amali_dropdown-item'))

WebUI.setText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__no_ktgn'), '30006')

WebUI.setEncryptedText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Permohonan TanahSaham_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/button_Permohonan Saya_kelulusan-tab'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/a_Dalam Semakan_mx-3 btn btn-sm d-flex alig_e6527c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/select__decision'), 
    'approve', true)

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/button_Kembali_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/span_Sejarah dan Rekod Buku Perkhidmatan_da_f953a4'))

WebUI.setText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__no_ktgn'), '88888')

WebUI.setEncryptedText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext_1'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Permohonan TanahSaham_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/button_Permohonan Saya_kelulusan-tab'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/a_Dalam Semakan_mx-3 btn btn-sm d-flex alig_e6527c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/select__decision'), 
    'approve', true)

WebUI.setText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/textarea_Catatan  Komen_remarks'), 
    'BAGUS')

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/button_Kembali_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/span_Sejarah dan Rekod Buku Perkhidmatan_da_f953a4'))

WebUI.setText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__no_ktgn'), '30004')

WebUI.setEncryptedText(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Dashboard/span_Permohonan TanahSaham_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/button_Permohonan Saya_kelulusan-tab'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/a_Dalam Semakan_mx-3 btn btn-sm d-flex alig_e6527c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/select__decision'), 
    'approve', true)

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Proses Kelulusan Permohonan Akt_2f367e/button_Kembali_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/PAP-ALL (BERSARA)/Page_MBSP - Pemakluman Penglibatan Politik/button_Permohonan Saya_kelulusan-tab'))

