package com.rozetka.www.ui.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SiteMap {

    private static final String DELIVERY_PAYMENT = "//li[@class='main-links__item']/a[@href='https://rozetka.com.ua/payments-and-deliveries/']";

    @Step
    public SiteMap clickDeliveryPayment() {
        $x(DELIVERY_PAYMENT).click();
        return this;
    }
}
