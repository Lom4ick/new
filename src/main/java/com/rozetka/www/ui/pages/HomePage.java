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
    private static final String COMPUTERS_LAPTOPS = "/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[1]/fat-menu/div/ul/li[1]/a";

    private static final String LOGIN_ERROR_MESSAGE = "//p[@class='error-message error-message_type_tooltip error-message_type_text error-message_color_red']";


    public HomePage authorize() {
        clickCabinet();
        setLogin("tester123tester@i.ua");
        setPassword("Automation555");
        clickEnterButton();
        return this;
    }

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

