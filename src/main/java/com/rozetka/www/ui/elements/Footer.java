package com.rozetka.www.ui.elements;


import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class Footer {

    private static final String CREDIT = "//footer//a[@href='https://rozetka.com.ua/credit/']";
    private static final String PAYMENTS_AND_DELIVERIES = "//footer//a[@href='https://rozetka.com.ua/payments-and-deliveries/']";
    private static final String WARRANTY = "//footer//a[@href='https://rozetka.com.ua/warranty/']";
    private static final String ITEM_RETURN = "//footer//a[@href='https://service.rozetka.com.ua/orders/']";
    private static final String SERVICE_CENTERS = "//footer//a[@href='https://rozetka.com.ua/service-centers/']";

    @Step
    public Footer creditClick() {
        $x(CREDIT).click();
        return this;
    }

    @Step
    public Footer paymentsAndDeliveriesClick() {
        $x(PAYMENTS_AND_DELIVERIES).click();
        return this;
    }

    @Step
    public Footer warrantyClick() {
        $x(WARRANTY).click();
        return this;
    }

    @Step
    public Footer itemReturnClick() {
        $x(ITEM_RETURN).click();
        return this;
    }

    @Step
    public Footer serviceCentersClick() {
        $x(SERVICE_CENTERS).click();
        return this;
    }

}
