package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {

    private By emailField = By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By passField = By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By dftrIcn = MobileBy.AccessibilityId("Masuk");

    private By errEmlTdkBlhKsg = MobileBy.AccessibilityId("Email tidak boleh kosong");

    private By passTdkBlhKsg = MobileBy.AccessibilityId("Tidak boleh kosong");

    public void inputEmail(String email){
        click(emailField);

        inputText(emailField, email);
    }

    public void inputPassword(String password){
        click(passField);

        inputText(passField, password);
        driver.hideKeyboard();
    }

    public void daftarIcon(){
        click(dftrIcn);
    }

    public void errorEmailTidakBolehKosong(){
        isDisplayed(errEmlTdkBlhKsg);
    }

    public void errorPasswordTidakBolehKosong(){
        isDisplayed(passTdkBlhKsg);
    }
}
