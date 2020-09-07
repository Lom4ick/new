package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {

    private static final String NOVAPOSHTA_DELIVERY = "//span[contains(text(),' Самовывоз из Новой Почты ')]";
    private static final String CARD_PAYMENT = "//span[contains(text(),' Картой онлайн ')]";
    private static final String CARD_PAYMENT_CHECKBOX = "//span[contains(text(),' Картой онлайн ')]/../../../input[@type='radio']";

    @Step
    public OrderPage selectNovaPoshta() {
        $x(NOVAPOSHTA_DELIVERY).click();
        return this;
    }

    @Step
    public OrderPage selectCardPayment() {
        $x(CARD_PAYMENT).click();
        return this;
    }

    @Step
    public OrderPage verifyCheckBoxes() {
        $x(NOVAPOSHTA_DELIVERY).isSelected();
        Assert.assertTrue($x(CARD_PAYMENT_CHECKBOX).isSelected(), "Expected checkbox was not selected\n");
        return this;
    }

}
