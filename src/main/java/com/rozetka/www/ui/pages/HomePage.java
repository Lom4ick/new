package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private static final String CABINET = "//a[@class='header-topline__user-link link-dashed']";
    private static final String LOGIN_INPUT = "//input[@id='auth_email']";
    private static final String PASSWORD_INPUT = "//input[@id='auth_pass']";
    private static final String ENTER_BUTTON = "//button[@class='button button_size_large button_color_green auth-modal__submit']";
    private static final String DELIVERY_PAYMENT = "//li[@class='main-links__item']/a[@href='https://rozetka.com.ua/payments-and-deliveries/']";
    private static final String COMPUTERS_LAPTOPS = "//a[@href='https://rozetka.com.ua/computers-notebooks/c80253/']";
    private static final String CATALOG = "//span[@class='menu-toggler__text']";

    private static final String LOGIN_ERROR_MESSAGE = "//p[@class='error-message error-message_type_tooltip error-message_type_text error-message_color_red']";

    private static final String REGISTRATION_BUTTON = "//a[@class='auth-modal__register-link']";
    private static final String SURNAME = "//input[@formcontrolname='surname']";
    private static final String NAME = "//input[@formcontrolname='name']";
    private static final String MAIL = "//input[@formcontrolname='username']";
    private static final String PASSWORD = "//input[@formcontrolname='password']";
    private static final String REGISTRATION_BUTTON2 = "//button[@class='button button_size_large button_color_green auth-modal__submit']";
    private static final String MAIL_VALIDATION_MESSAGE = "//p[@class='validation-message']";



    public HomePage authorize() {
        clickCabinet();
        setLogin("tester123tester@i.ua");
        setPassword("Automation555");
        clickEnterButton();
        return this;
    }

    public HomePage registrationMailErrorCheck() {
        clickCabinet();
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
    public HomePage clickCatalog() {
        $x(CATALOG).click();
        return this;
    }

    @Step
    public HomePage clickRegistration() {
        $x(REGISTRATION_BUTTON).click();
        return this;
    }

    @Step
    public HomePage inputSurname() {
        $x(SURNAME).setValue("Агафян");
        return this;

    }

    @Step
    public HomePage inputName() {
        $x(NAME).setValue("Артемон");
        return this;
    }

    @Step
    public HomePage inputMail() {
        $x(MAIL).setValue("newerUseThisMail");
        return this;
    }

    @Step
    public HomePage inputPassword() {
        $x(PASSWORD).setValue("TotallyWrongPass12345");
        return this;
    }

    @Step
    public HomePage clickRegistrationButton() {
        $x(REGISTRATION_BUTTON2).click();
        return this;
    }

    @Step
    public HomePage verifyMailErrorMessage() {
        $x(MAIL_VALIDATION_MESSAGE).shouldBe(Condition.appears);
        return this;
    }

  // -----------------------------------------------------
    @Step
    public HomePage clickCabinet() {
        $x(CABINET).click();
        return this;
    }

    @Step
    public HomePage setLogin(String login) {
       $x(LOGIN_INPUT).setValue(login);
        return this;
    }

    @Step
    public HomePage setPassword(String password) {
        $x(PASSWORD_INPUT).setValue(password);
        return this;
    }

    @Step
    public HomePage clickEnterButton() {
        $x(ENTER_BUTTON).click();
        return this;
    }


    @Step
    public HomePage verifyLoginErrorMessage() {
         $x(LOGIN_ERROR_MESSAGE).shouldBe(Condition.appears);
        return this;
    }

    @Step
    public HomePage clickDeliveryPayment() {
        $x(DELIVERY_PAYMENT).shouldBe(Condition.appears);
        return this;
    }

    @Step
    public HomePage clickComputersLaptops() {
        $x(COMPUTERS_LAPTOPS).click();
        return this;
    }
}

