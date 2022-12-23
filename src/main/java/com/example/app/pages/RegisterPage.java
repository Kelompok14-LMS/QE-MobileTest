package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class RegisterPage extends BasePageObject {

//    private By dshbrdPage = MobileBy.AccessibilityId("Hello! Ayo Mulai Belajar Bersama EduWorld");

    private By sljtyaIcn = MobileBy.AccessibilityId("Selanjutnya");

    private By ayoMliIcn = MobileBy.AccessibilityId("Ayo Mulai!");

    private By dftrIcn = MobileBy.AccessibilityId("Daftar");

    private By regPg = MobileBy.AccessibilityId("Ayo Jadi Mentee!");

    private By namaLengkap = By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By email = By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By nomerPonsel = By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");

    private By password = By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[4]");

    private By daftar = By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");

    private By otp = By.xpath("//android.view.View[@content-desc=\"Sukses mengirim OTP ke email\"]");

    private By emlTdkBlhKsng = By.xpath("(//android.view.View[@content-desc=\"Tidak boleh kosong\"])[1]");

    private By nmLngkpTdkBlhKsng = By.xpath("(//android.view.View[@content-desc=\"Tidak boleh kosong\"])[1]");

    private By nmrPnslTdkBlhKsng = By.xpath("(//android.view.View[@content-desc=\"Tidak boleh kosong\"])[2]");

    private By emailSalah = By.xpath("//android.view.View[@content-desc=\"Masukkan Email dengan benar\"]");

    private By pswrdTdkBlhKsng = By.xpath("(//android.view.View[@content-desc=\"Tidak boleh kosong\"])[4]");
    //    public void dashboardPage(){
//        isDisplayed(dshbrdPage);
//    }

    public void selanjutnyaIcon(){
        click(sljtyaIcn);
    }

    public void ayoMulaiIcon(){
        click(ayoMliIcn);
    }

    public void daftarIcon(){
        click(dftrIcn);
    }

    public void registerPage(){
        isDisplayed(regPg);
    }

    public void inputNamaLengkap(String namaLengkapp){
        click(namaLengkap);

        inputText(namaLengkap, namaLengkapp);
    }

    public void inputEmail(String emaill){
        click(email);

        inputText(email, emaill);
    }

    public void inputNomerPonser(String noPonsel){
        click(nomerPonsel);

        inputText(nomerPonsel, noPonsel);
    }

    public void inputPassword(String passwordd){
        click(password);

        inputText(password, passwordd);
        driver.hideKeyboard();
    }

    public void daftarClick(){
        click(daftar);
    }

    public void sendOtp(){
        isDisplayed(otp);
    }

    public void errorEmailTidakBolehKosong(){
        isDisplayed(emlTdkBlhKsng);
    }

    public void errorNamaTidakBolehKosong(){
        isDisplayed(nmLngkpTdkBlhKsng);
    }

    public void errorNmrPnslTidakBolehKosong(){
        isDisplayed(nmrPnslTdkBlhKsng);
    }

    public void errorPasswordTidakBolehKosng(){
        isDisplayed(pswrdTdkBlhKsng);
    }

    public void errorEmailDenganBenar(){
        isDisplayed(emailSalah);
    }

}
