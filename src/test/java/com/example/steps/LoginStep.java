package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginStep {

    @Steps
    LoginPage loginPage;

    @And("i input null emaill")
    public void iInputNullEmaill() {
        loginPage.inputEmail("");
    }

    @And("i input null passwordd")
    public void iInputNullPasswordd() {
        loginPage.inputPassword("");
    }

    @And("i click masuk icon")
    public void iClickMasukIcon() {
        loginPage.daftarIcon();
    }

    @Then("i get email tidak boleh kosong")
    public void iGetEmailTidakBolehKosong() {
        loginPage.errorEmailTidakBolehKosong();
    }

    @And("i input valid emaill")
    public void iInputValidEmaill() {
        loginPage.inputEmail("davidsagala992@gmail.com");
    }

    @Then("i get password tidak boleh kosong")
    public void iGetPasswordTidakBolehKosong() {
        loginPage.errorPasswordTidakBolehKosong();
    }

    @And("i input valid passwordd")
    public void iInputValidPasswordd() {
        loginPage.inputPassword("12345678");
    }
}
