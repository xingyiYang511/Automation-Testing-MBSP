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

WebUI.setText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__no_ktgn'), '99999')

WebUI.setEncryptedText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Permohonan Aktiviti Politik_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Eksport_btn btn-sm btn-secondary'))

WebUI.setText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/input__party_name'), 
    'DAP')

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/input_Perakuan_employee_declaration'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/button_Kembali_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/span_Log Keluar_hide-mob ms-2'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Konfigurasi Pelatih Amali_dropdown-item'))

WebUI.setText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__no_ktgn'), '30006')

WebUI.setEncryptedText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Permohonan Aktiviti Politik_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/button_Permohonan Saya_kelulusan-tab'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Dalam Semakan_mx-3 btn btn-sm align-items_349b6f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Proses Kelulusan Pemakluman Akt_a2d4b0/select__decision'), 
    'approve', true)

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Proses Kelulusan Pemakluman Akt_a2d4b0/button_Kembali_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/span_Sejarah dan Rekod Buku Perkhidmatan_da_f953a4'))

WebUI.setText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__no_ktgn'), '88888')

WebUI.setEncryptedText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext_1'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Permohonan Aktiviti Politik_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/button_Permohonan Saya_kelulusan-tab'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Dalam Semakan_mx-3 btn btn-sm align-items_349b6f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Proses Kelulusan Pemakluman Akt_a2d4b0/select__decision'), 
    'approve', true)

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Proses Kelulusan Pemakluman Akt_a2d4b0/button_Kembali_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/span_Sejarah dan Rekod Buku Perkhidmatan_da_f953a4'))

WebUI.setText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__no_ktgn'), '99999')

WebUI.setEncryptedText(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/input__password'), 'ReS8CS55u3r9nXfefBFv2A==')

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Log Masuk/button__login_button'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Lapor Diri_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Dashboard/span_Permohonan Aktiviti Politik_dash-mtext'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Diluluskan_mx-3 btn btn-sm d-flex align-i_490c98'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/button_Lihat Pemakluman Penglibatan Politik_8ff372'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Diluluskan_mx-3 btn btn-sm d-flex align-i_83a56a'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pengakuan Kelulusan Permohonan/input_Pemberitahuan Penting_acknowledgement'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pengakuan Kelulusan Permohonan/button_Kembali_btn btn-success'))

WebUI.click(findTestObject('Object Repository/PeAP-ALL/Page_MBSP - Pemakluman Keahlian Dalam Parti_3d949c/a_Diakui_mx-3 btn btn-sm align-items-center d-flex'))

