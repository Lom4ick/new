package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {

    private static final String REGISTRATION_BUTTON = "//a[@class='auth-modal__register-link']";
    private static final String SURNAME = "//input[@formcontrolname='surname']";
    private static final String NAME = "//input[@formcontrolname='name']";
    private static final String MAIL = "//input[@formcontrolname='username']";
    private static final String PASSWORD = "//input[@formcontrolname='password']";
    private static final String REGISTRATION_BUTTON2 = "//button[@class='button button_size_large button_color_green auth-modal__submit']";
    private static final String MAIL_VALIDATION_MESSAGE = "//p[@class='validation-message']";

    private static final String LOGIN_INPUT = "//input[@id='auth_email']";
    private static final String PASSWORD_INPUT = "//input[@id='auth_pass']";
    private static final String ENTER_BUTTON = "//button[@class='button button_size_large button_color_green auth-modal__submit']";
    private static final String LOGIN_ERROR_MESSAGE = "//p[@class='error-message error-message_type_tooltip error-message_type_text error-message_color_red']";

    //--------------------------------------------------
    public RegistrationPage registrationMailErrorCheck() {
        clickRegistration();
        inputSurname();
        inputName();
        inputMail();
        inputPassword();
        clickRegistrationButton();
        verifyMailErrorMessage();
        return this;
    }

    @Step
    public RegistrationPage clickRegistration() {
        $x(REGISTRATION_BUTTON).click();
        return this;
    }

    @Step
    public RegistrationPage inputSurname() {
        $x(SURNAME).setValue("Агафян");
        return this;

    }

    @Step
    public RegistrationPage inputName() {
        $x(NAME).setValue("Артемон");
        return this;
    }

    @Step
    public RegistrationPage inputMail() {
        $x(MAIL).setValue("newerUseThisMail");
        return this;
    }

    @Step
    public RegistrationPage inputPassword() {
        $x(PASSWORD).setValue("TotallyWrongPass12345");
        return this;
    }

    @Step
    public RegistrationPage clickRegistrationButton() {
        $x(REGISTRATION_BUTTON2).click();
        return this;
    }

    @Step
    public RegistrationPage verifyMailErrorMessage() {
        $x(MAIL_VALIDATION_MESSAGE).shouldBe(Condition.appears);
        return this;
    }

    //-------------------------------------------------

    public RegistrationPage authorize() {
        setLogin("tester123tester@i.ua");
        setPassword("Automation555");
        clickEnterButton();
        return this;
    }

    @Step
    public RegistrationPage setLogin(String login) {
        $x(LOGIN_INPUT).setValue(login);
        return this;
    }

    @Step
    public RegistrationPage setPassword(String password) {
        $x(PASSWORD_INPUT).setValue(password);
        return this;
    }

    @Step
    public RegistrationPage clickEnterButton() {
        $x(ENTER_BUTTON).click();
        return this;
    }

    @Step
    public RegistrationPage verifyLoginErrorMessage() {
        $x(LOGIN_ERROR_MESSAGE).shouldBe(Condition.appears);
        return this;
    }

}

