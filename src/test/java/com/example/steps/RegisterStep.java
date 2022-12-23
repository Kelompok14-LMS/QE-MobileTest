package com.example.steps;

import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {

    @Steps
    RegisterPage registerPage;

    @When("i click Selanjutnya icon")
    public void iClickSelanjutnyaIcon() {
        registerPage.selanjutnyaIcon();
    }

    @And("i click Ayo Mulai icon")
    public void iClickAyoMulaiIcon() {
        registerPage.ayoMulaiIcon();
    }

    @And("i click daftar icon")
    public void iClickDaftarIcon() {
        registerPage.daftarIcon();
    }

    @Then("i go to register page")
    public void iGoToRegisterPage() {
        registerPage.registerPage();
    }

    @And("i input valid nama lengkap")
    public void iInputValidNamaLengkap() {
        registerPage.inputNamaLengkap("David Raymond");
    }

    @And("i input valid email")
    public void iInputValidEmail() {
        registerPage.inputEmail("davidsagala02@gmail.com");
    }

    @And("i input valid nomer ponsel")
    public void iInputValidNomerPonsel() {
        registerPage.inputNomerPonser("089668726313");
    }

    @And("i input valid password")
    public void iInputValidPassword() {
        registerPage.inputPassword("sagalak001");
    }

    @Then("i click daftar")
    public void iClickDaftar() {
        registerPage.daftarClick();
    }


    @And("i input null nama lengkap")
    public void iInputNullNamaLengkap() {
        registerPage.inputNamaLengkap("");
    }

    @And("i input null email")
    public void iInputNullEmail() {
        registerPage.inputEmail("");
    }

    @And("i input null nomer ponsel")
    public void iInputNullNomerPonsel() {
        registerPage.inputNomerPonser("");
    }

    @And("i input null password")
    public void iInputNullPassword() {
        registerPage.inputPassword("");
    }

    @Then("i get error message email tidak boleh kosong")
    public void iGetErrorMessageEmailTidakBolehKosong() {
        registerPage.errorNamaTidakBolehKosong();
    }

    @Then("i get error message nama lengkap tidak boleh kosong")
    public void iGetErrorMessageNamaLengkapTidakBolehKosong() {
        registerPage.errorEmailTidakBolehKosong();
    }

    @Then("i get error message password tidak boleh kosong")
    public void iGetErrorMessagePasswordTidakBolehKosong() {
        registerPage.errorPasswordTidakBolehKosng();
    }

    @And("i input invalid email")
    public void iInputInvalidEmail() {
        registerPage.inputEmail("contohemailsalah");
    }

    @Then("i get error message masukkan email dengan benar")
    public void iGetErrorMessageMasukkanEmailDenganBenar() {
        registerPage.errorEmailDenganBenar();
    }

    @Then("i get error message nomor ponsel tidak boleh kosong")
    public void iGetErrorMessageNomorPonselTidakBolehKosong() {
        registerPage.errorNmrPnslTidakBolehKosong();
    }
}
